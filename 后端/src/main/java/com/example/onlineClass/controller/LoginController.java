package com.example.onlineClass.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.onlineClass.response.ResponseResult;
import com.example.onlineClass.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 钟
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    /** 调用Service层 */
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ResponseResult<JSONObject> login(@RequestBody String jsonBody) {
        JSONObject jsonBodyPar = JSON.parseObject(jsonBody);
        String phone = jsonBodyPar.getString("phone");
        String password = jsonBodyPar.getString("password");
        return userService.checkPassword(phone,password);
    }
}