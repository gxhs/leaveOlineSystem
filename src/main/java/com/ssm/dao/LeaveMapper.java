package com.ssm.dao;

import com.ssm.entity.Leave;
import com.ssm.entity.LeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
    int countByExample(LeaveExample example);
    int countBySid(Integer id);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);

    //so
    Leave selectOneBySno(Integer sno);
    List<Leave> getAll();
    List<Leave> selectLeaveBySno(Integer id);
    List<Leave> selectAllUnratifyBySno(String approver);
    Leave selectRatifyBySno(Integer sno);
}