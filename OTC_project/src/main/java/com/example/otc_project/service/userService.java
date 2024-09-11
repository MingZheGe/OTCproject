package com.example.otc_project.service;
import com.example.otc_project.dao.userEntityMapper;
import com.example.otc_project.entity.user;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class userService {
    @Autowired
    private userEntityMapper userEntityMapper;

    public user login(user user){
        user result = userEntityMapper.login(user);
        return result;
    }

    public int register(user user){
        int result = userEntityMapper.register(user);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updatePassword(user user){
        int result = userEntityMapper.updatePassword(user);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }


}
