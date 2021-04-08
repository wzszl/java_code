package com.wzs.shirodemo.common.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description 自定义异常
 * @Author WuZhiSong
 * @Date 2021/4/8 16:28
 * @Version 1.0.0
 */
public class MyShiroException {

    /**
     * @Description 处理Shiro权限拦截异常，如果返回JSON数据格式请加上 @ResponseBody注解
     * @Date 16:28 2021/4/8
     * @Param []
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @ResponseBody
    @ExceptionHandler(value = AuthorizationException.class)
    public Map<String,Object> defaultErrorHandler(){
        Map<String,Object> map = new HashMap<>();
        map.put("403","权限不足");
        return map;
    }
}
