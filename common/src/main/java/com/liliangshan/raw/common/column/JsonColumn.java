package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * JsonColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class JsonColumn extends AbstractColumn {

    public JsonColumn() {
        this(null);
    }

    public JsonColumn(Object rawValue) {
        super(rawValue, FieldType.JSON, rawValue.toString().length());
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
