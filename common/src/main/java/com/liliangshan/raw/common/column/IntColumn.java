package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * IntColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class IntColumn extends AbstractColumn {

    public IntColumn() {
        this(null);
    }

    public IntColumn(Integer rawValue) {
        super(rawValue, FieldType.INT, rawValue == null ? 0 : 4);
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
