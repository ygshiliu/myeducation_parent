package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.School;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@FeignClient("schoolServer")
public interface SchoolService {

    @RequestMapping("/test")
    public String test();

    @RequestMapping("/allSchool")
    public List<School> getAllSchoole();

    @RequestMapping("/pastAllSchool")
    public List<School> pastAllSchool();
}
