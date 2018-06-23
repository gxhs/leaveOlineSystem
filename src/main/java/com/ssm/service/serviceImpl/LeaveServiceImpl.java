package com.ssm.service.serviceImpl;

import com.ssm.dao.LeaveMapper;
import com.ssm.entity.Leave;
import com.ssm.entity.LeaveExample;
import com.ssm.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class LeaveServiceImpl implements LeaveService {

    @Autowired
    LeaveMapper leaveMapper;

    @Override
    public void insert(Leave leave) {
        leaveMapper.insertSelective(leave);
    }

    @Override
    public Leave select() {
        return null;
    }

    @Override
    public Leave selectByUserId(Integer userId) {
        return null;
    }

    @Override
    public void updateStateById(Leave leave,Integer id) {
        LeaveExample leaveExample=new LeaveExample();
        LeaveExample.Criteria criteria=leaveExample.createCriteria();
        criteria.andIdEqualTo(id);
        leaveMapper.updateByExampleSelective(leave,leaveExample);
    }

    @Override
    public int countBySid(Integer id) {
        return leaveMapper.countBySid(id);
    }

    @Override
    public List<Leave> selectByExample(String example) {
        LeaveExample leaveExample=new LeaveExample();
        LeaveExample.Criteria criteria=leaveExample.createCriteria();
        criteria.andApproverEqualTo(example);
        List<Leave> leaveList=leaveMapper.selectByExample(leaveExample);
        return leaveList;
    }

    @Override
    public Leave selectLeaveBySno(Integer id) {
        return leaveMapper.selectRatifyBySno(id);
    }

    @Override
    public List<Leave> selectAllUnratifyBySno(String approver) {
        return leaveMapper.selectAllUnratifyBySno(approver);
    }

    @Override
    public void update(Leave leave) {
        leaveMapper.updateByPrimaryKeySelective(leave);
    }
}
