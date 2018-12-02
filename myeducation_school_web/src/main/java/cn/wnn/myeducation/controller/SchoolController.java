package cn.wnn.myeducation.controller;

import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
        List<School> schools = schoolService.getAllSchoole();
        request.setAttribute("schools",schools);
        return "schoolList";
    }
    //停用校区，模版使用一个schoolList
    @RequestMapping("/pastAllSchoolInfo")
    public String pastAllSchoolInfo(HttpServletRequest request){
        List<School> schools = schoolService.pastAllSchool();
        request.setAttribute("schools",schools);
        return "schoolList";
    }
    @RequestMapping("/schoolAdd.html")
    public String schoolAdd(){
        return "schoolAdd";
    }
}
