package com.wzs.shirodemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description 系统用户实体类
 * @Author WuZhiSong
 * @Date 2021/4/8 15:27
 * @Version 1.0.0
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐值(为了使相同的密码拥有不同的hash值的一种手段就是盐化，盐值就是在密码hash过程中添加的额外的随机值)
     */
    private String salt;
    /**
     * 状态:NORMAL正常  PROHIBIT禁用
     */
    private String state;
}
