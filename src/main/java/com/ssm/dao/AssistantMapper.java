package com.ssm.dao;

import com.ssm.entity.Assistant;
import com.ssm.entity.AssistantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssistantMapper {
    int countByExample(AssistantExample example);

    int deleteByExample(AssistantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assistant record);

    int insertSelective(Assistant record);

    Assistant selectByExample(AssistantExample example);

    Assistant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assistant record, @Param("example") AssistantExample example);

    int updateByExample(@Param("record") Assistant record, @Param("example") AssistantExample example);

    int updateByPrimaryKeySelective(Assistant record);

    int updateByPrimaryKey(Assistant record);
}