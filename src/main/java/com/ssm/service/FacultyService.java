package com.ssm.service;

import com.ssm.entity.Faculty;
import com.ssm.entity.Leave;

import java.util.List;

//院系
public interface FacultyService {
    Faculty selectByName(String name);
    List<Leave> getLeave(String sno);
    Leave getOne(String sno);
}
