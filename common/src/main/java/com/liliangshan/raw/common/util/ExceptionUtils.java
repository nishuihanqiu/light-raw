package com.liliangshan.raw.common.util;

import com.liliangshan.raw.common.exception.NoSuchFieldTypeException;
import com.liliangshan.raw.common.exception.RawArgumentException;

/************************************
 * ExceptionUtils
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class ExceptionUtils {

    public static void checkNull(Object object, String message) throws RawArgumentException {

    }

    public static void checkNotNull(Object object, String message) throws RawArgumentException {

    }

    public static void checkNull(Object object, String code, String message) throws RawArgumentException {

    }

    public static void checkNotNull(Object object, String code, String message) throws RawArgumentException {

    }

    public static NoSuchFieldTypeException createFieldTypeException(String message)  {
        return new NoSuchFieldTypeException(message);
    }

    public static NoSuchFieldTypeException createFieldTypeException(String code, String message) {
        return new NoSuchFieldTypeException(code, message);
    }

}
