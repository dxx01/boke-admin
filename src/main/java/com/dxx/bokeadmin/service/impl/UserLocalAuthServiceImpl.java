package com.dxx.bokeadmin.service.impl;

import com.dxx.bokeadmin.mapper.UserLocalAuthMapper;
import com.dxx.bokeadmin.model.UserLocalAuth;
import com.dxx.bokeadmin.service.UserLocalAuthService;
import com.dxx.bokeadmin.tools.ErrorCode;
import com.dxx.bokeadmin.tools.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLocalAuthServiceImpl extends DefaultServiceImpl<UserLocalAuthMapper ,UserLocalAuth> implements UserLocalAuthService {

    final UserLocalAuthMapper userLocalAuthMapper;

    @Autowired
    public UserLocalAuthServiceImpl(UserLocalAuthMapper userLocalAuthMapper){
        this.userLocalAuthMapper = userLocalAuthMapper;
    }


    /**
     * 根据电话号码查询用户
     * @param phone
     * @return
     */
    @Override
    public UserLocalAuth selectByPhone(String phone) {
        UserLocalAuth userLocalAuth = userLocalAuthMapper.selectByPhone(phone);
        if(userLocalAuth == null){
            throw new MyException(ErrorCode.NO_USER);
        }
        return userLocalAuth;
    }
}
