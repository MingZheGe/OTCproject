package com.example.otc_project.controller;

import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.user;
import com.example.otc_project.service.userService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class userController {

    @Autowired
    private userService userService;

    @RequestMapping("/login")
    public HttpResponseEntity userLogin(@RequestBody user user) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            user hasUser = userService.login(user);
            if (hasUser==null) {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(null);
                httpResponseEntity.setMessage("fail");
            } else {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(hasUser);
                httpResponseEntity.setMessage("success");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updatePassword")
    public HttpResponseEntity updatePassword(@RequestBody user user) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = userService.updatePassword(user);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/register")
    public HttpResponseEntity register(@RequestBody user user) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = userService.register(user);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

}
