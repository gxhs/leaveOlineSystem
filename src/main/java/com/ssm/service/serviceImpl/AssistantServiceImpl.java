package com.ssm.service.serviceImpl;

import com.ssm.dao.AssistantMapper;
import com.ssm.dao.LeaveMapper;
import com.ssm.entity.Assistant;
import com.ssm.entity.AssistantExample;
import com.ssm.entity.Leave;
import com.ssm.service.AssistantService;
import com.ssm.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistantServiceImpl implements AssistantService {
    @Autowired
    private AssistantMapper assistantMapper;

    @Autowired
    private LeaveMapper leaveMapper;


//    @Override
//    public Assistant selectByAno(Integer ano) {
//    }

    @Override
    public Assistant selectByAno(String ano) {
        AssistantExample assistantExample=new AssistantExample();
        AssistantExample.Criteria criteria=assistantExample.createCriteria();
        criteria.andAnoEqualTo(ano);
        assistantMapper.selectByExample(assistantExample);
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

    @Override
    public List<Leave> selectLeaveBySno(Integer id) {
        List<Leave> leaveList=leaveMapper.selectLeaveBySno(id);
        return leaveList;
    }


    @Override
    public Leave selectOneBySno(Integer sno) {
      Leave leave=leaveMapper.selectOneBySno(sno);
        return leave;
    }

    @Override
    public List<Leave> getAll() {
        List<Leave> leaveList=leaveMapper.getAll();
        return leaveList;
    }

    @Override
    public Assistant selectNameBySid(Integer id) {
        Assistant assistant=assistantMapper.selectNameBySid(id);
        return assistant;
    }

    @Override
    public Assistant selectByPrimaryKey(Integer id) {
        return assistantMapper.selectByPrimaryKey(id);
    }
    //    @Override
//    public List<Leave> selectleave(Leave leave) {
//        return null;
//    }

//    @Override
//    public Assistant selectOneBySno(Integer id) {
//
//        return null;
//    }


}
