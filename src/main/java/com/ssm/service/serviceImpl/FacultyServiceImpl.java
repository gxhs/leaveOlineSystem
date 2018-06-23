package com.ssm.service.serviceImpl;

import com.ssm.dao.FacultyMapper;
import com.ssm.entity.Faculty;
import com.ssm.entity.Leave;
import com.ssm.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//院系
@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyMapper facultyMapper;


    @Override
    public Faculty selectByName(String name) {
        return null;
    }

    @Override
    public List<Leave> getLeave(String sno) {
        List<Leave> leaveList=facultyMapper.getLeave(sno);
        return leaveList;
    }


    @Override
    public Leave getOne(String sno) {
        Leave leave=facultyMapper.getOne(sno);
        return leave;
    }

//    @Override
//    public List<Leave> getLeave(Integer sno) {
//
//    }

}
