package com.example.onlineClass.service;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.onlineClass.mapper.UserMapper;
import com.example.onlineClass.model.UserData;
import com.example.onlineClass.response.MyException;
import com.example.onlineClass.response.ResponseResult;
import com.example.onlineClass.response.ResultCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟
 */
@Service("UserService")
public class UserService {

    /** 调用Mapper层 */
    @Resource
    private UserMapper userMapper;

    /**
     * 校验密码
     * @param phone 手机号码
     * @param password 密码
     * @return ResponseResult<JSONObject> 格式的返回数据
     */
    public ResponseResult<JSONObject> checkPassword(String phone, String password){
        // 根据手机号取回user对象
        UserData user = userMapper.checkPasswordFromPhone(phone.trim());
        JSONObject result = new JSONObject();
        if(user!=null) {
            if (user.getPwd().equals(password)){
                result.put("head", user.getHead_img());
                result.put("name", user.getName());
                return new ResponseResult<>(ResultCode.LOGIN_SUCCESS, result);
            }
            // 密码错误 返回false
            else {
                throw new MyException(ResultCode.LOGIN_PASSWORD_FAIL);
            }
        }// 账号不存在 返回false
        else {
            throw new MyException(ResultCode.LOGIN_ACCOUNT_ERROR);
        }
    }
}
