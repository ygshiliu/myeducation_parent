package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.School;
import cn.wnn.myeducation.mapper.SchoolMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    public PageInfo<School> getAll(Map<String, Object> map){
        School school = new School();
        school.setStatus("1");
        int pageNo =Integer.parseInt((String)map.get("pageNo"));
        int pageSize =Integer.parseInt((String)map.get("pageSize"));

        PageHelper.startPage(pageNo,pageSize);
        List<School> schools = schoolMapper.select(school);
        PageInfo<School> pageInfo = new PageInfo<>(schools);
        return pageInfo;
    }

    public PageInfo<School> pastAllSchool(Map<String, Object> map) {
        School school = new School();
        school.setStatus("0");

        int pageNo =Integer.parseInt((String)map.get("pageNo"));
        int pageSize =Integer.parseInt((String)map.get("pageSize"));

        PageHelper.startPage(pageNo,pageSize);
        List<School> schools = schoolMapper.select(school);
        PageInfo<School> pageInfo = new PageInfo<>(schools);
        return pageInfo;
    }

    @Override
    public void addSchool(School school) {
        schoolMapper.insert(school);
    }

    @Override
    public void updateSchoolStatus(School school) {
        schoolMapper.updateByPrimaryKeySelective(school);
    }

    @Override
    public School getSchooleById(String id) {
        School school = new School();
        school.setId(Integer.parseInt(id));
        School school1 = schoolMapper.selectByPrimaryKey(school);
        return school1;
    }

    @Override
    public void updateSchool(School school) {
        schoolMapper.updateByPrimaryKeySelective(school);
    }

}
