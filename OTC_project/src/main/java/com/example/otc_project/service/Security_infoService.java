package com.example.otc_project.service;

import com.example.otc_project.dao.security_infoEntityMapper;
import com.example.otc_project.entity.customer_opening_info;
import com.example.otc_project.entity.security_info;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Security_infoService {
    @Autowired
    private security_infoEntityMapper securityInfoEntityMapper;

    public List<security_info> showSecurity_info(){
        List<security_info> result = securityInfoEntityMapper.showSecurity_info();
        return result;
    }

    public List<security_info> searchSZsecurity(){
        List<security_info> result = securityInfoEntityMapper.searchSZsecurity();
        return result;
    }

    public List<security_info> searchSHsecurity(){
        List<security_info> result = securityInfoEntityMapper.searchSHsecurity();
        return result;
    }

}
