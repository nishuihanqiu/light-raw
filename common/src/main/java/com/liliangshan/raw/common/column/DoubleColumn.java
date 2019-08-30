package com.liliangshan.raw.common.column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/************************************
 * DoubleColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class DoubleColumn extends AbstractColumn<Double> {

    public DoubleColumn() {
        this((Double) null, 0);
    }

    public DoubleColumn(Long data) {
        this(data == null ? null : data.doubleValue(), 8);
    }

    public DoubleColumn(Integer data) {
        this(data == null ? null : data.doubleValue(), 4);
    }

    public DoubleColumn(Double data) {
        this(data, data == null ? 0 : 8);
    }

    private DoubleColumn(Double data, int byteSize) {
        this(data == null ? null : new BigDecimal(String.valueOf(data)).toPlainString() , byteSize);
    }

    public DoubleColumn(Float data) {
        this(data == null ? null : data.doubleValue(), 4);
    }

    public DoubleColumn(BigDecimal data) {
        this(null == data ? null : data.toPlainString(), data != null ? data.toPlainString().length() : 0);
    }

    public DoubleColumn(BigInteger data) {
        this(null == data ? null : data.toString(), data != null ? data.toString().length() : 0);
    }

    private DoubleColumn(String data, int byteSize) {
        super(Double.valueOf(data), FieldType.DOUBLE, byteSize);
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
    public String toString() {
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
