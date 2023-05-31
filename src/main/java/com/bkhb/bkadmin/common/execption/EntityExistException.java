package com.bkhb.bkadmin.common.execption;

import org.springframework.util.StringUtils;

/**
 * 实体已存在
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/30 16:19
 */
public class EntityExistException extends RuntimeException {
    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " existed";
    }}
