package com.ssm.service.serviceImpl;

import com.ssm.dao.LeaveMapper;
import com.ssm.entity.Leave;
import com.ssm.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void updateById(Integer id) {

    }
}
