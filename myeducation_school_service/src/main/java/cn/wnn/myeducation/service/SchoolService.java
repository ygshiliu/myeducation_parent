package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.School;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
public interface SchoolService {

    public PageInfo<School> getAll(Map<String, Object> map);
    public PageInfo<School>  pastAllSchool(Map<String, Object> map);

    void addSchool(School school);

    void updateSchoolStatus(School school);

    School getSchooleById(String id);

    void updateSchool(School school);
}
