package com.liliangshan.raw.common.column;

import com.liliangshan.raw.common.util.ExceptionUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Date;

/************************************
 * BytesColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class BytesColumn extends AbstractColumn<BytesColumn.Bytes> {

    public BytesColumn(byte[] bytes) {
        super(new Bytes(bytes), FieldType.BYTES, null == bytes ? 0 : bytes.length);
    }

    @Override
    public Long toLong() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 Long");
    }

    @Override
    public Double toDouble() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 Double");
    }

    @Override
    public Date toDate() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 Date");
    }

    @Override
    public byte[] toBytes() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.getRawValue().getBytes();
    }

    @Override
    public Boolean toBoolean() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 Boolean");
    }

    @Override
    public BigDecimal toBigDecimal() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 BigDecimal");
    }

    @Override
    public BigInteger toBigInteger() {
        throw ExceptionUtils.createFieldTypeException("bytes 不能转 BigInteger");
    }

    @Override
    public String asString() {
        if (null == this.toBytes()) {
            return null;
        }
        return new String(this.toBytes(), StandardCharsets.UTF_8);
    }

    public static class Bytes {

        private byte[] bytes;

        public Bytes(byte[] bytes) {
            this.bytes = bytes;
        }

        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

        public byte[] getBytes() {
            return bytes;
        }
    }

}
