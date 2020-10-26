package com.dxx.bokeadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户关联表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthRel {
    private int id;
    private int userId;
    private String token;
    private int authId;
    private String authType;
}
