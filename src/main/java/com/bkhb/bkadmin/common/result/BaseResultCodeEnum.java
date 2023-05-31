package com.bkhb.bkadmin.common.result;


import com.bkhb.bkadmin.common.model.IDict;

/**
 */
public enum BaseResultCodeEnum implements IResultCode, IDict<Integer> {

    /**
     * 执行成功
     */
    SUCCESS(200, "操作成功"),

    ENTITY_EXIST(410, "资源已经不存在(过去存在)"),

    /**
     * 系统异常
     */
    SYSTEM_ERROR(500, "系统异常")
    ;

    /**
     * 枚举编号
     */
    private final Integer code;

    /**
     * 枚举详情
     */
    private final String message;


    /**
     * 构造方法
     *
     * @param code    枚举编号
     * @param message 枚举详情
     */
    BaseResultCodeEnum(Integer code, String message) {
        init(code, message);
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
