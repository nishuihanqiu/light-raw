package com.liliangshan.raw.common.exception;

/************************************
 * NoSuchFieldTypeException
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class NoSuchFieldTypeException extends RawException {

    private static final String DEFAULT_CODE = "raw_exception";

    public NoSuchFieldTypeException(String message) {
        this(DEFAULT_CODE, message);
    }

    public NoSuchFieldTypeException(String code, String message) {
        this(code, message, null);
    }

    public NoSuchFieldTypeException(String message, Throwable cause) {
        this(DEFAULT_CODE, message, cause);
    }

    public NoSuchFieldTypeException(Throwable cause) {
        this("", cause);
    }

    public NoSuchFieldTypeException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
