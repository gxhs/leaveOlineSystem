package com.ssm.service;

import com.ssm.entity.Assistant;

public interface AssistantService {
    Assistant selectByAno(String ano);
    void deleteByAno(Integer ano);
    void updateByAno(Integer ano);
    void insert(Assistant assistant);
}
