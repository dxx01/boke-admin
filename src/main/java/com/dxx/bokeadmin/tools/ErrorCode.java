package com.dxx.bokeadmin.tools;

import lombok.AllArgsConstructor;

/**
 * @Auther: ${Mr.Deng}
 * @Date: 2020/4/30 15:34
 * @Description: 错误码类
 */
@AllArgsConstructor
public enum ErrorCode implements IErrorCode {
    SUCCESS("200", "成功"),
    No_LOGIN("201", "未登录"),
    ERROR("500", "服务内部错误"),
    NULL_POINTER("400", "空指针异常"),
    FORCED_TO_LOGOFF("101", "已经另一台机器登录，您被迫下线。"),
    WRONG_PASSWORD("4001","密码错误"),
    ACCOUNT_ERROR("4002", "账号错误"),
    NO_USER("4003", "该用户不存在"),
    NO_DATA("4004","暂无数据"),
    HAS_PHONE("4005","该电话号码已注册");


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String msg() {
        return msg;
    }
}
