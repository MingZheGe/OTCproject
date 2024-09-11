package com.example.otc_project.dao;


import com.example.otc_project.entity.security_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface security_infoEntityMapper {
    List<security_info> showSecurity_info();

    List<security_info> searchSHsecurity();

    List<security_info> searchSZsecurity();
}
