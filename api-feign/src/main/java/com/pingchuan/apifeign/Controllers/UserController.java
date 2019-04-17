package com.pingchuan.apifeign.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 接口用户访问类
 * @author: XW
 * @create: 2019-04-16 09:13
 **/
@RestController
public class UserController {

    @RequestMapping("/findAllByPage")
    public String findAllByPage(){
        return "小武";
    }
}
