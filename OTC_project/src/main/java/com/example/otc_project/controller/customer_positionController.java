package com.example.otc_project.controller;


import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.customer_position;
import com.example.otc_project.service.customer_positionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class customer_positionController {
    @Autowired
    private customer_positionService customerPositionService;

    @RequestMapping("/insertCustomer_position")
    public HttpResponseEntity insertCustomer_position(@RequestBody List<customer_position> customerPositions) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerPositionService.insertCustomer_position(customerPositions);
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

    @RequestMapping("/groupcustomerAllposition")
    public HttpResponseEntity groupcustomerAllposition(@RequestBody customer_position customerPositions) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_position> result = customerPositionService.groupcustomerAllposition(customerPositions);
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

    @RequestMapping("/showAccountposition")
    public HttpResponseEntity showAccountposition(@RequestBody customer_position customerPositions) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_position> result = customerPositionService.showAccountposition(customerPositions);
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

    @RequestMapping("/deleteAccountpostion")
    public HttpResponseEntity deleteAccountpostion(@RequestBody customer_position customerPositions) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerPositionService.deleteAccountpostion(customerPositions);
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

    @RequestMapping("/insertGroupposition")
    public HttpResponseEntity insertGroupposition(@RequestBody List<customer_position> customerPositions) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerPositionService.insertGroupposition(customerPositions);
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
}
