package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * LongColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class LongColumn extends AbstractColumn {

    public LongColumn() {
        this((Long) null);
    }

    public LongColumn(Integer rawValue) {
        this(rawValue == null ? null : BigInteger.valueOf(rawValue));
    }

    public LongColumn(Long rawValue) {
        this(rawValue == null ? null : BigInteger.valueOf(rawValue));
    }

    public LongColumn(BigInteger data) {
        this(data, null == data ? 0 : 8);
    }

    private LongColumn(BigInteger data, int byteSize) {
        super(data, FieldType.LONG, byteSize);
    }

    @Override
    public Long toLong() {
        return null;
    }

    @Override
    public Double toDouble() {
        return null;
    }

    @Override
    public Date toDate() {
        return null;
    }

    @Override
    public byte[] toBytes() {
        return new byte[0];
    }

    @Override
    public Boolean toBoolean() {
        return null;
    }

    @Override
    public BigDecimal toBigDecimal() {
        return null;
    }

    @Override
    public BigInteger toBigInteger() {
        return null;
    }

    @Override
    public String asString() {
        return null;
    }

}
