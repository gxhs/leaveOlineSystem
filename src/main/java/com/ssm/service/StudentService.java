package com.ssm.service;

import com.ssm.entity.Student;

public interface StudentService {
    Student selectBySno(String sno);
    Student selectByPrimaryKey(Integer id);
}
