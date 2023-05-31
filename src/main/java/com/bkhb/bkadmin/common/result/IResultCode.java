package com.bkhb.bkadmin.common.result;

/**
 */
public interface IResultCode {
    /**
     * 返回的错误码.
     *
     * @return String
     */
    Integer getCode();

    /**
     * 返回的错误信息.
     *
     * @return String
     */
    String getMessage();
}
