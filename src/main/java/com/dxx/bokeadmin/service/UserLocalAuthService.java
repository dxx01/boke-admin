package com.dxx.bokeadmin.service;

import com.dxx.bokeadmin.model.UserLocalAuth;

public interface UserLocalAuthService extends DefaultService<UserLocalAuth> {

    UserLocalAuth selectByPhone(String phone);
}
