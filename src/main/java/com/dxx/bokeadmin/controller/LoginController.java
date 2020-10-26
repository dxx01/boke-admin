package com.dxx.bokeadmin.controller;

import com.dxx.bokeadmin.model.UserLocalAuth;
import com.dxx.bokeadmin.service.UserLocalAuthService;
import com.dxx.bokeadmin.tools.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {

    final
    UserLocalAuthService userLocalAuthService;

    public LoginController(UserLocalAuthService userLocalAuthService){
        this.userLocalAuthService = userLocalAuthService;
    }

    /**
     * 注册
     * @param userLocalAuth
     * @return
     */
    @PostMapping("register")
    public JsonResult register(@RequestBody UserLocalAuth userLocalAuth){
        //注册用户随机生成用户名
        userLocalAuth.setUsername("用户"+ UUID.randomUUID());
        userLocalAuthService.insert(userLocalAuth);
        return JsonResult.success();
    }
}
