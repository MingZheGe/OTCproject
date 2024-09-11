package com.example.otc_project.controller;


import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.market_info;
import com.example.otc_project.service.market_infoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class market_infoCotroller {
    @Autowired
    private market_infoService marketInfoService;


    @RequestMapping("/showMarket_info")
    public HttpResponseEntity showMarket_info(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<market_info> result = marketInfoService.showMarket_info();
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


    @RequestMapping("/searchMarket_info")
    public HttpResponseEntity searchMarket_info(@RequestBody market_info marketInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<market_info> result = marketInfoService.searchMarket_info(marketInfo);
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
