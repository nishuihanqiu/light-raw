package com.liliangshan.raw.common.exception;

/************************************
 * RawArgumentException
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class RawArgumentException extends RawException {

    public RawArgumentException(String message) {
        super(message);
    }

    public RawArgumentException(String code, String message) {
        super(code, message);
    }

    public RawArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public RawArgumentException(Throwable cause) {
        super(cause);
    }

    public RawArgumentException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
    
}
