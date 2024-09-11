package com.example.otc_project.dao;

import com.example.otc_project.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface userEntityMapper {
    user login(user user);

    int register(user user);

    int updatePassword(user user);
}
