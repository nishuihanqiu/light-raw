package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * StringColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class StringColumn extends AbstractColumn {

    public StringColumn() {
        this(null);
    }

    public StringColumn(String rawValue) {
        super(rawValue, FieldType.STRING, rawValue == null ? 0 : rawValue.length());
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
