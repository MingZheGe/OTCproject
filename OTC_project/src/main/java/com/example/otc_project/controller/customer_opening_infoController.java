package com.example.otc_project.controller;

import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.customer_opening_info;
import com.example.otc_project.service.customer_opening_infoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class customer_opening_infoController {
    @Autowired
    private customer_opening_infoService customerOpeningInfoService;

    @RequestMapping("/insertCustomer_opening_info")
    public HttpResponseEntity insertCustomer_opening_info(@RequestBody customer_opening_info customerOpeningInfo) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOpeningInfoService.insertCustomer_opening_info(customerOpeningInfo);
            if (result != 0) {
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

    @RequestMapping("/showCustomer_opening_info")
    public HttpResponseEntity showCustomer_opening_info() {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_opening_info> result = customerOpeningInfoService.showCustomer_opening_info();
            if (result != null) {
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

    @RequestMapping("/updateCustomer_rest")
    public HttpResponseEntity updateCustomer_rest(@RequestBody customer_opening_info customerOpeningInfo) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOpeningInfoService.updateCustomer_rest(customerOpeningInfo);
            if (result != 0) {
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

    @RequestMapping("/updateCustomer_SZ_info")
    public HttpResponseEntity updateCustomer_SZ_info(@RequestBody customer_opening_info customerOpeningInfo) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOpeningInfoService.updateCustomer_SZ_info(customerOpeningInfo);
            if (result != 0) {
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

    @RequestMapping("/updateCustomer_SH_info")
    public HttpResponseEntity updateCustomer_SH_info(@RequestBody customer_opening_info customerOpeningInfo) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOpeningInfoService.updateCustomer_SH_info(customerOpeningInfo);
            if (result != 0) {
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

    @RequestMapping("/searchCustomer")
    public HttpResponseEntity searchCustomer(@RequestBody customer_opening_info customerOpeningInfo) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            customer_opening_info result = customerOpeningInfoService.searchCustomer(customerOpeningInfo);
            if (result != null) {
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
