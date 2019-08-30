package com.liliangshan.raw.core.spi;

import java.io.InputStream;

/************************************
 * Reader
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public interface Reader<T> {

    T read(String path);

    T read(InputStream inputStream);

    boolean available();

    void close();


}
