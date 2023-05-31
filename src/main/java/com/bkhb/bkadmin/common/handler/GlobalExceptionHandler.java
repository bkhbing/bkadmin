package com.bkhb.bkadmin.common.handler;

import com.bkhb.bkadmin.common.execption.BadRequestException;
import com.bkhb.bkadmin.common.execption.EntityExistException;
import com.bkhb.bkadmin.common.execption.EntityNotFoundException;
import com.bkhb.bkadmin.common.result.BaseResultCodeEnum;
import com.bkhb.bkadmin.common.result.ResultWrapper;
import com.bkhb.bkadmin.common.utils.ThrowableUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常拦截
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/30 16:20
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理所有不可知的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Throwable.class)
    public ResultWrapper<?> handleException(Throwable e){
        // 打印堆栈信息
        log.error(ThrowableUtil.getStackTrace(e));
        return ResultWrapper.fail(BaseResultCodeEnum.SYSTEM_ERROR);
    }
    /**
     * 处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = BadRequestException.class)
    public ResultWrapper<?> badRequestException(BadRequestException e) {
        // 打印堆栈信息
        log.error(ThrowableUtil.getStackTrace(e));
        return ResultWrapper.fail(e.getStatus(), e.getMessage());
    }

    /**
     * 处理 EntityExist
     * @param e
     * @return
     */
    @ExceptionHandler(value = EntityExistException.class)
    public ResultWrapper<?> entityExistException(EntityExistException e) {
        // 打印堆栈信息
        log.error(ThrowableUtil.getStackTrace(e));
        return ResultWrapper.fail(BaseResultCodeEnum.ENTITY_EXIST);
    }

    /**
     * 处理 EntityNotFound
     * @param e
     * @return
     */
    @ExceptionHandler(value = EntityNotFoundException.class)
    public ResultWrapper<?> entityNotFoundException(EntityNotFoundException e) {
        // 打印堆栈信息
        log.error(ThrowableUtil.getStackTrace(e));
        return ResultWrapper.fail(BaseResultCodeEnum.ENTITY_EXIST);
    }
}
