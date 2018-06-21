package com.ssm.dao;

import com.ssm.entity.Faculty;
import com.ssm.entity.FacultyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FacultyMapper {
    int countByExample(FacultyExample example);

    int deleteByExample(FacultyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Faculty record);

    int insertSelective(Faculty record);

    Faculty selectByExample(FacultyExample example);

    Faculty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByExample(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByPrimaryKeySelective(Faculty record);

    int updateByPrimaryKey(Faculty record);
}