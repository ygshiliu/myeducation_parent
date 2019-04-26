package cn.wnn.myeducation.controller;

import cn.wnn.myeducation.bean.Page;
import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.service.SchoolService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    //现校区
    @RequestMapping("/allSchool")
    public Page<School> getAllSchoole(@RequestBody Map<String, Object> map) {
        PageInfo<School> pageInfo = schoolService.getAll(map);
        Page page = new Page<School>();
        BeanUtils.copyProperties(pageInfo, page);
        return page;
    }

    //历史校区
    @RequestMapping("/pastAllSchool")
    public Page<School> pastAllSchool(@RequestBody Map<String, Object> map) {
        PageInfo<School> pageInfo = schoolService.pastAllSchool(map);
        Page page = new Page<School>();
        BeanUtils.copyProperties(pageInfo, page);
        return page;
    }

    @RequestMapping("/addSchool")
    public void addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
    }

    @RequestMapping("/updateSchoole")
    public void updateSchool(@RequestBody School school) {
        schoolService.updateSchool(school);
    }

    @RequestMapping("/updateSchoolStatus")
    public void updateSchoolStatus(@RequestBody School school) {
        schoolService.updateSchoolStatus(school);
    }

    @RequestMapping("/getSchooleById/{id}")
    public School getSchooleById(@PathVariable("id") String id) {
        School school = schoolService.getSchooleById(id);
        return school;
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("1111111111111111");
        return "abc";
    }
}
