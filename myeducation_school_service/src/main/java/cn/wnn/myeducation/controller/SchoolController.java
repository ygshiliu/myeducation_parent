package cn.wnn.myeducation.controller;

import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    //现校区
    @RequestMapping("/allSchool")
    public List<School> getAllSchoole(){
        List<School> schools = schoolService.getAll();
        return schools;
    }

    //历史校区
    @RequestMapping("/pastAllSchool")
    public List<School> pastAllSchool(){
        List<School> schools = schoolService.pastAllSchool();
        return schools;
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("1111111111111111");
        return "abc";
    }
}
