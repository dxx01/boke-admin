package com.dxx.bokeadmin.controller;

import com.dxx.bokeadmin.model.UserLocalAuth;
import com.dxx.bokeadmin.tools.JsonResult;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
public class TestController {

    @PostMapping("hello")
    public JsonResult test(@RequestBody UserLocalAuth u){
        System.out.println(u);
        return JsonResult.success();
    }

    @GetMapping("home")
    public JsonResult home(){
        return JsonResult.success();
    }

    @PostMapping("login")
    public JsonResult login(){
        return JsonResult.success();
    }

    @Test
    public void test2(){
        System.out.println(UUID.randomUUID());
    }
}
