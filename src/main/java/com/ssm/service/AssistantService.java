package com.ssm.service;

import com.ssm.entity.Assistant;
import com.ssm.entity.Leave;

import java.util.List;

public interface AssistantService {
    Assistant selectByAno(String ano);
    void deleteByAno(Integer ano);
    void updateByAno(Integer ano);
    void insert(Assistant assistant);
    List<Leave> selectLeaveBySno(Integer id);
    Leave selectOneBySno(Integer id);
    List<Leave> getAll();
    Assistant selectNameBySid(Integer id);
    Assistant selectByPrimaryKey(Integer id);
}
