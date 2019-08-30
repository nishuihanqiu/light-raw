package com.liliangshan.raw.common.exception;

/************************************
 * RawException
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class RawException extends RuntimeException {

    private static final String DEFAULT_CODE = "raw_exception";

    private String code;

    public RawException(String message) {
        this(DEFAULT_CODE, message, null);
    }

    public RawException(String code, String message) {
        this(code, message, null);
    }

    public RawException(String message, Throwable cause) {
        this(DEFAULT_CODE, message, cause);
    }

    public RawException(Throwable cause) {
        this(DEFAULT_CODE, "", cause);
    }

    public RawException(String code, String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

}
