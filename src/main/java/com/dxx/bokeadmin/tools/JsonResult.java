package com.dxx.bokeadmin.tools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: ${Mr.Deng}
 * @Date: 2020/4/30 11:31
 * @Description: 公共返回类
 */
@Data
@NoArgsConstructor
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -4800793124936904868L;
    //返回的状态
    private String code;

    //返回的提示
    private String msg;


    //返回的数据
    private Object data;


    public JsonResult(IErrorCode iErrorCode) {
        this.code = iErrorCode.code();
        this.msg = iErrorCode.msg();
    }



    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 成功 不返回数据
     *
     * @return
     */
    public static JsonResult success() {
        return new JsonResult(ErrorCode.SUCCESS.code(), ErrorCode.SUCCESS.msg());
    }

    /**
     * 成功返回数据
     *
     * @param data 返回的数据
     * @return
     */
    public static JsonResult success(Object data) {
        return new JsonResult(ErrorCode.SUCCESS.code(), ErrorCode.SUCCESS.msg(), data);
    }

    /**
     * 未知错误
     *
     * @return
     */
    public static JsonResult error() {
        return new JsonResult(ErrorCode.ERROR.code(), ErrorCode.ERROR.msg());
    }


    /**
     * 自定义业务异常
     *
     * @param code
     * @param msg
     * @return
     */
    public static JsonResult error(String code, String msg) {
        return new JsonResult(code, msg);
    }

    /**
     * 自定义业务异常2
     *
     * @param ie
     * @return
     */
    public static JsonResult error(IErrorCode ie) {
        return new JsonResult(ie.code(), ie.msg());
    }
}
