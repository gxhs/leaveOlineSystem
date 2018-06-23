package com.ssm.dao;

import com.ssm.entity.Assistant;
import com.ssm.entity.AssistantExample;
import com.ssm.entity.Leave;
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

    //so
//    List<Leave> selectLeaveBySno(Integer id);
//   Leave selectOneBySno(Integer sno);
//    List<Leave> getAll();
    Assistant selectNameBySid(Integer id);
}