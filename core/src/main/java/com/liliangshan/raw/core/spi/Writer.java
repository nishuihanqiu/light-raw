package com.liliangshan.raw.core.spi;

import java.io.IOException;

/************************************
 * Writer
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public interface Writer<T> {

    void write(T data) throws IOException;

    void flush() throws IOException;

    boolean available();

    void close() throws IOException;

}
