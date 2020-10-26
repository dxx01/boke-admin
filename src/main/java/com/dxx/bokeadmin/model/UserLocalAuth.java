package com.dxx.bokeadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 本地用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLocalAuth {
    private int id;
    private String username;
    private String phone;
    private String password;
    private String status;
}
