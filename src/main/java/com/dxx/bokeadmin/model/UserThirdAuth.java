package com.dxx.bokeadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 第三方用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserThirdAuth {
    private int id;
    private String openId;
    private String loginType;
    private String accessToken;
}
