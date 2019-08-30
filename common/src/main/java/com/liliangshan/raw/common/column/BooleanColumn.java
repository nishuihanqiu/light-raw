package com.liliangshan.raw.common.column;

import com.liliangshan.raw.common.util.ExceptionUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * BooleanColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class BooleanColumn extends AbstractColumn<Boolean> {

    public BooleanColumn() {
        this(null);
    }

    public BooleanColumn(Boolean rawValue) {
        super(rawValue, FieldType.BOOLEAN, rawValue == null ? 0 : 1);
    }

    @Override
    public Long toLong() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.toBoolean() ? 1L : 0L;
    }

    @Override
    public Double toDouble() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.toBoolean() ? 1.0 : 0.0;
    }

    @Override
    public Date toDate() {
        throw ExceptionUtils.createFieldTypeException("不支持从 boolean 转 date ");
    }

    @Override
    public byte[] toBytes() {
        throw ExceptionUtils.createFieldTypeException("不支持从 boolean 转 bytes ");
    }

    @Override
    public Boolean toBoolean() {
        return this.getRawValue();
    }

    @Override
    public BigDecimal toBigDecimal() {
        if (null == this.getRawValue()) {
            return null;
        }
        return BigDecimal.valueOf(this.toLong());
    }

    @Override
    public BigInteger toBigInteger() {
        if (null == this.getRawValue()) {
            return null;
        }
        return BigInteger.valueOf(this.toLong());
    }

    @Override
    public String asString() {
        if (null == this.getRawValue()) {
            return null;
        }
        return this.toBoolean() ? "true" : "false";
    }
}
