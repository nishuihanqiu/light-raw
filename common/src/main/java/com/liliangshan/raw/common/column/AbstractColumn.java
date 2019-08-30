package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * AbstractColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public abstract class AbstractColumn<T> implements Column<T> {

    private FieldType type;
    private T rawValue;
    private int byteSize;
    private String key;

    public AbstractColumn(T rawValue, FieldType type, String key, int byteSize) {
        this.type = type;
        this.rawValue = rawValue;
        this.byteSize = byteSize;
        this.key = key;
    }

    public AbstractColumn(T rawValue, FieldType type, int byteSize) {
        this(rawValue, type, "0", byteSize);
    }

    public abstract Long toLong();

    public abstract Double toDouble();

    public abstract Date toDate();

    public abstract byte[] toBytes();

    public abstract Boolean toBoolean();

    public abstract BigDecimal toBigDecimal();

    public abstract BigInteger toBigInteger();

    public abstract String asString();

    @Override
    public boolean isNull() {
        return getRawValue() == null;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    final public FieldType getType() {
        return this.type;
    }

    @Override
    final public T getRawValue() {
        return this.rawValue;
    }

    @Override
    public int getByteSize() {
        return this.byteSize;
    }

}
