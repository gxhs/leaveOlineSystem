package com.ssm.service;

import com.ssm.entity.Leave;

public interface LeaveService {
    void insert(Leave leave);
    Leave select();
    Leave selectByUserId(Integer userId);
    void updateById(Integer id);
}
