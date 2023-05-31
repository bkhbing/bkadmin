package com.bkhb.bkadmin.common.execption;

import org.springframework.util.StringUtils;

/**
 * 实体不存在
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/30 16:18
 */
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }
}
