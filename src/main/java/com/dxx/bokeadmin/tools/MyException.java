package com.dxx.bokeadmin.tools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected String code;
    /**
     * 错误信息
     */
    protected String msg;

    public MyException(IErrorCode ie) {
        this.code = ie.code();
        this.msg = ie.msg();
    }
}

