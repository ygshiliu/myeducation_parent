package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.Classroom;
import cn.wnn.myeducation.bean.EduClass;
import cn.wnn.myeducation.bean.Page;
import cn.wnn.myeducation.bean.School;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@FeignClient("schoolServer")
public interface SchoolService {

    @RequestMapping("/test")
    public String test();

    @RequestMapping("/allSchool")
    public Page<School> getAllSchoole(@RequestBody Map<String, Object> map);

    @RequestMapping("/pastAllSchool")
    public Page<School> pastAllSchool(@RequestBody Map<String, Object> map);

    @RequestMapping("/addSchool")
    void addSchool(@RequestBody School school);

    @RequestMapping("/updateSchoolStatus")
    void updateSchoolStatus(@RequestBody School school);

    @RequestMapping("/getSchooleById/{id}")
    School getSchooleById(@PathVariable("id") String id);

    @RequestMapping("/updateSchoole")
    void updateSchool(@RequestBody School school);

    @RequestMapping("/addAllClassroom")
    void addAllClassroom(@RequestBody List<Classroom> list);

    @RequestMapping("/getAllClassroom")
    public Page<Classroom> getAllClassroom(@RequestBody Map<String, Object> map);

    @RequestMapping("/addEduclass")
    String addEduclass(@RequestBody EduClass educlass);

    @RequestMapping("/getEduclassById")
    EduClass getEduclassById(@RequestParam("educlassId") String educlassId);

    @RequestMapping("/alleduClass")
    Page<EduClass> getAlleduClass(@RequestBody Map<String, Object> map);

    @RequestMapping("/allEnableClassromm")
    List<Classroom> getEnableClassrommAll();

    @RequestMapping("/getstatusbyclassroom")
    String getstatusbyclassroom(@RequestBody Classroom room);

    @RequestMapping("/getEduclassByroomId")
    EduClass getEduclassByroomId(@RequestBody Map<String, String> map);
}
