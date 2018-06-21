package com.ssm.service.serviceImpl;

import com.ssm.dao.AssistantMapper;
import com.ssm.entity.Assistant;
import com.ssm.entity.AssistantExample;
import com.ssm.entity.Student;
import com.ssm.entity.StudentExample;
import com.ssm.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistantServiceImpl implements AssistantService {

    @Autowired
    AssistantMapper assistantMapper;

    @Override
    public Assistant selectByAno(String ano) {
        AssistantExample assistantExample=new AssistantExample();
        AssistantExample.Criteria criteria=assistantExample.createCriteria();
        criteria.andAnoEqualTo(ano);
        return assistantMapper.selectByExample(assistantExample);
    }

    @Override
    public void deleteByAno(Integer ano) {

    }

    @Override
    public void updateByAno(Integer ano) {

    }

    @Override
    public void insert(Assistant assistant) {

    }
}
