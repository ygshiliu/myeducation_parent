package cn.wnn.myeducation.service;

import cn.wnn.myeducation.bean.School;

import java.util.List;

/**
 * Created by Administrator on 2018/12/1 0001.
 */
public interface SchoolService {

    public List<School> getAll();
    public List<School> pastAllSchool();

}
