package com.dxx.bokeadmin.mapper;

import com.dxx.bokeadmin.model.UserLocalAuth;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserLocalAuthMapper extends BaseMapper<UserLocalAuth> {

    /**
     * 根据电话号码查询用户信息
     * @param phone 电话号码
     * @return
     */
    UserLocalAuth selectByPhone(@Param("phone") String phone);
}
