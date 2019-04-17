package com.pingchuan.domain;

import lombok.Data;

/**
 * @description: 用户对象
 * @author: XW
 * @create: 2019-04-16 15:56
 **/
@Data
public class User {
    private int id;
    private int organizationId;
    private String name;
    private String username;
    private String password;
}
