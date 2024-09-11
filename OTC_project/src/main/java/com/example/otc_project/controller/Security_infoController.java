package com.example.otc_project.controller;


import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.security_info;
import com.example.otc_project.service.Security_infoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Security_infoController {
    @Autowired
    private Security_infoService securityInfoService;

    @RequestMapping("/showSecurity_info")
    public HttpResponseEntity showSecurity_info(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<security_info> result = securityInfoService.showSecurity_info();
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/searchSZsecurity")
    public HttpResponseEntity searchSZsecurity(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<security_info> result = securityInfoService.searchSZsecurity();
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/searchSHsecurity")
    public HttpResponseEntity searchSHsecurity(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<security_info> result = securityInfoService.searchSHsecurity();
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

}
