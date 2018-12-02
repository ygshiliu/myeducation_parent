package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    public List<School> getAll(){
        School school = new School();
        school.setStatus("1");
        List<School> schools = schoolMapper.select(school);
        return schools;
    }

    public List<School> pastAllSchool() {
        School school = new School();
        school.setStatus("0");
        List<School> schools = schoolMapper.select(school);
        return schools;
    }
}
