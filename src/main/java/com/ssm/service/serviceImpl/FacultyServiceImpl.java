package com.ssm.service.serviceImpl;

import com.ssm.dao.FacultyMapper;
import com.ssm.entity.Faculty;
import com.ssm.entity.FacultyExample;
import com.ssm.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//院系
@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    FacultyMapper facultyMapper;
    @Override
    public Faculty selectByName(String name) {
        FacultyExample facultyExample = new FacultyExample();
        FacultyExample.Criteria criteria=facultyExample.createCriteria();
        criteria.andNameEqualTo(name);
        return facultyMapper.selectByExample(facultyExample);
    }
}
