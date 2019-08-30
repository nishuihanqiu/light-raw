package com.liliangshan.raw.common.column;

/************************************
 * Column
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public interface Column<T> {

    FieldType getType();

    T getRawValue();

    int getByteSize();

    boolean isNull();

    String key();

}
