package cn.wnn.myeducation.controller;

import cn.wnn.myeducation.WebUtil;
import cn.wnn.myeducation.bean.Page;
import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.service.SchoolService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("welcome.html")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/test")
    public String test(){
        String str = schoolService.test();
        System.out.println("str="+str);
        return "index";
    }

    //现用校区
    @RequestMapping("/showAllSchoolInfo")
    public String showAllSchoolInfo(HttpServletRequest request){
        String pageNo = request.getParameter("pageNo");
        String pageSize = request.getParameter("pageSize");
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);

        Page<School> page = schoolService.getAllSchoole(map);
        WebUtil.spellUrl(page,request,map);

        request.setAttribute("page",page);
        return "schoolList";
    }
    //停用校区，模版使用一个schoolList
    @RequestMapping("/pastAllSchoolInfo")
    public String pastAllSchoolInfo(HttpServletRequest request){
        String pageNo = request.getParameter("pageNo");
        String pageSize = request.getParameter("pageSize");
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);

        Page<School> page = schoolService.pastAllSchool(map);
        WebUtil.spellUrl(page,request,map);

        request.setAttribute("page",page);
        return "schoolList";
    }
    @RequestMapping("/toSchoolAdd.html")
    public String toSchoolAdd(HttpServletRequest request){
        request.setAttribute("school",new School());
        return "schoolAdd";
    }

    @RequestMapping("/schoolAdd")
    @ResponseBody
    public void schoolAdd(School school){

        if(school.getId()==null) {
            //新增校区默认状态都为1
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date = format.format(new Date());
            school.setCreateDate(date);
            school.setStatus("1");
            schoolService.addSchool(school);
        }else{
            schoolService.updateSchool(school);
        }
    }
    @RequestMapping("updateSchoolStatus")
    @ResponseBody
    public boolean updateSchoolStatus(int id,String status){
        //status:0停用 1正常
        School school = new School();
        school.setId(id);
        school.setStatus(status);
        schoolService.updateSchoolStatus(school);
        return true;
    }

    @RequestMapping("toschooledit.html")
    public String toschooledit(String id,HttpServletRequest request){
        School school = schoolService.getSchooleById(id);
        request.setAttribute("school",school);
        return "schoolAdd";
    }

    @RequestMapping("downloadClassroomTemplate")
    public String downloadClassroomTemplate(HttpServletRequest request, HttpServletResponse response) {

//        ServletContext servletContext = request.getServletContext();
//        String realPath = servletContext.getRealPath("static/classroom.xlsx");
        String realPath="F:\\workspace_onlineEducation\\myeducation_parent\\myeducation_school_web\\src\\main\\resources\\static\\static\\classroom.xlsx";
        try {
            FileInputStream in = new FileInputStream(realPath);
            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=classroom.xlsx");// 设置文件名
            ServletOutputStream out = response.getOutputStream();
            IOUtils.copy(in,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //上传教室信息
    @RequestMapping("formUploadroom")
    @ResponseBody
    public String formUploadroom(MultipartFile classroom,String schId){

        //TODO:poi操作数据到数据库中
        System.out.println("success");
        return null;
    }
}
