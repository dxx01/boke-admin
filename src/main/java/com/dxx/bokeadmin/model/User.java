package com.dxx.bokeadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户基础表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String token;
    private String expireIn;
    private String tryTimes;
}
