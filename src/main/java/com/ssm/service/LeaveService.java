package com.ssm.service;

import com.ssm.entity.Leave;
import com.ssm.entity.LeaveExample;

import java.util.List;

public interface LeaveService {
    void insert(Leave leave);
    Leave select();
    Leave selectByUserId(Integer userId);
    void updateStateById(Leave leave,Integer id);
    int countBySid(Integer id);
    List<Leave> selectByExample(String example);
    Leave selectLeaveBySno(Integer id);
    List<Leave> selectAllUnratifyBySno(String approver);
    void  update(Leave leave);
}
