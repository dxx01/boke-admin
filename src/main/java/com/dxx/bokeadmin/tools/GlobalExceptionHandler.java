package com.dxx.bokeadmin.tools;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: ${Mr.Deng}
 * @Date: 2020/4/30 16:53
 * @Description: 全局异常处理类
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    /**
     * 处理未知异常
     *
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public JsonResult exceptionHandkler(Exception e) {
        return JsonResult.error();
    }

    /**
     * 处理空指针的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    public JsonResult exceptionHandler(NullPointerException e) {
        return JsonResult.error(ErrorCode.NULL_POINTER);
    }

    /**
     * 自定义异常处理
     *
     * @param me
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    public JsonResult myExceptionHandkler(MyException me) {
        return JsonResult.error(me.getCode(), me.getMsg());
    }

}
