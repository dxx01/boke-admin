package com.dxx.bokeadmin.controller;

import com.dxx.bokeadmin.model.UserLocalAuth;
import com.dxx.bokeadmin.service.UserLocalAuthService;
import com.dxx.bokeadmin.tools.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user_local")
public class UserLocalAuthController {

    final
    UserLocalAuthService userLocalAuthService;

    public UserLocalAuthController(UserLocalAuthService userLocalAuthService){
        this.userLocalAuthService = userLocalAuthService;
    }

    /**
     * 根据电话号码查询用户信息
     * @param phone
     * @return
     */
    @GetMapping("selectByPhone")
    public JsonResult selectByPhone(@RequestParam("phone") String phone){
        UserLocalAuth userLocalAuth = userLocalAuthService.selectByPhone(phone);
        return JsonResult.success(userLocalAuth);
    }
}
