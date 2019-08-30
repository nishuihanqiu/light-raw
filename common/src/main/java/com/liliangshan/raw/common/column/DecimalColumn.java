package com.liliangshan.raw.common.column;

import com.liliangshan.raw.common.util.ExceptionUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * DecimalColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class DecimalColumn extends AbstractColumn<BigDecimal> {

    private DecimalColumn(BigDecimal value, int byteSize) {
        super(value, FieldType.DECIMAL, byteSize);
    }

    public DecimalColumn(BigDecimal value) {
        this(value, null == value ? 0 : 8);
    }

    public DecimalColumn(Integer value) {
        this(null == value ? null : new BigDecimal(value), null == value ? 0 : 4);
    }

    public DecimalColumn(Long value) {
        this(null == value ? null : new BigDecimal(value), null == value ? 0 : 8);
    }

    public DecimalColumn(Float value) {
        this(null == value ? null : new BigDecimal(value), null == value ? 0 : 4);
    }

    public DecimalColumn(Double value) {
        this(null == value ? null : new BigDecimal(value), null == value ? 0 : 8);
    }

    @Override
    public Long toLong() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.getRawValue().longValue();
    }

    @Override
    public Double toDouble() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.getRawValue().doubleValue();
    }

    @Override
    public Date toDate() {
        throw ExceptionUtils.createFieldTypeException("不支持 BigDecimal 转 Date");
    }

    @Override
    public byte[] toBytes() {
        throw ExceptionUtils.createFieldTypeException("不支持 BigDecimal 转 byte[]");
    }

    @Override
    public Boolean toBoolean() {
        throw ExceptionUtils.createFieldTypeException("不支持 BigDecimal 转 Boolean");
    }

    @Override
    public BigDecimal toBigDecimal() {
        return this.getRawValue();
    }

    @Override
    public BigInteger toBigInteger() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.getRawValue().toBigInteger();
    }

    @Override
    public String asString() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.getRawValue().toPlainString();
    }

}
