package com.ssm.service;

import com.ssm.entity.Faculty;

//院系
public interface FacultyService {
    Faculty selectByName(String name);
}
