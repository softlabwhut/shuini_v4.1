package com.whut.shuini.controller;

import com.whut.shuini.bean.Result;
import com.whut.shuini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/userByName")
    @ResponseBody
    public Result userByName(@RequestParam("username") String username){
        Result result=new Result();
        result.setStatus(1);
        result.setObject(userService.selectUserByName(username));
        return result;
    }
}
