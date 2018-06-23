package com.ssm.service.serviceImpl;

import com.ssm.dao.StudentMapper;
import com.ssm.entity.Student;
import com.ssm.entity.StudentExample;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StundentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student selectBySno(String example) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria=studentExample.createCriteria();
        criteria.andSnoEqualTo(example);
        return (Student) studentMapper.selectByExample(studentExample);
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
