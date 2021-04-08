package com.wzs.shirodemo.common.shiro;

import com.wzs.shirodemo.common.constant.RedisConstant;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;

import java.io.Serializable;

/**
 * @description 自定义SessionId生成器
 * @Author WuZhiSong
 * @Date 2021/4/8 16:18
 * @Version 1.0.0
 */
public class ShiroSessionIdGenerator implements SessionIdGenerator {
    
    /**
     * @Description 实现SessionId生成
     * @Date 16:19 2021/4/8
     * @Param [session]
     * @return java.io.Serializable
     **/
    @Override
    public Serializable generateId(Session session) {
        Serializable sessionId = new JavaUuidSessionIdGenerator().generateId(session);
        return String.format(RedisConstant.REDIS_PREFIX_LOGIN, sessionId);
    }
}
