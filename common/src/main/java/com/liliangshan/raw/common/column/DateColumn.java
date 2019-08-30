package com.liliangshan.raw.common.column;

import com.liliangshan.raw.common.util.ExceptionUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.TimeZone;

/************************************
 * DateColumn
 * @author liliangshan
 * @date 2019/8/29
 ************************************/
public class DateColumn extends AbstractColumn<java.util.Date> {

    public enum DateType {
        DATE, TIME, DATETIME
    }

    private DateType subType = DateType.DATETIME;

    public DateColumn() {
        this((Long) null);
    }

    public DateColumn(Long timeMs) {
        super( timeMs == null ? null : new Date(timeMs), FieldType.DATE, (null == timeMs ? 0 : 8));
        this.setSubType(DateType.DATETIME);
    }

    public DateColumn(java.util.Date date) {
        this(date.getTime());
    }

    public DateColumn(Date date) {
        this(date == null ? null : date.getTime());
        this.setSubType(DateType.DATE);
    }

    public DateColumn(Time time) {
        this(time == null ? null : time.getTime());
        this.setSubType(DateType.TIME);
    }

    public DateColumn(Timestamp ts) {
        this(ts == null ? null : ts.getTime());
    }

    @Override
    public Long toLong() {
        if (this.getRawValue() == null) {
            return null;
        }
        return this.toDate().getTime();
    }

    @Override
    public Double toDouble() {
        throw ExceptionUtils.createFieldTypeException("不支持 Date 转 Double");
    }

    @Override
    public java.util.Date toDate() {
        return this.getRawValue();
    }

    @Override
    public byte[] toBytes() {
        throw ExceptionUtils.createFieldTypeException("不支持 Date 转 byte[]");
    }

    @Override
    public Boolean toBoolean() {
        throw ExceptionUtils.createFieldTypeException("不支持 Date 转 Boolean");
    }

    @Override
    public BigDecimal toBigDecimal() {
        throw ExceptionUtils.createFieldTypeException("不支持 Date 转 BigDecimal");
    }

    @Override
    public BigInteger toBigInteger() {
        throw ExceptionUtils.createFieldTypeException("不支持 Date 转 BigInteger");
    }

    @Override
    public String asString() {
        if (null == this.toDate()) {
            return null;
        }

        switch (this.getSubType()) {
            case DATE:
                return DateFormatUtils.format(this.toDate(), dateFormat, timeZoneR);
            case TIME:
                return DateFormatUtils.format(this.toDate(), timeFormat, timeZoneR);
            case DATETIME:
                return DateFormatUtils.format(this.toDate(), datetimeFormat, timeZoneR);
            default:
                throw ExceptionUtils.createFieldTypeException("时间类型出现不支持类型，目前仅支持DATE/TIME/DATETIME");
        }
    }

    private void setSubType(DateType subType) {
        this.subType = subType;
    }

    public DateType getSubType() {
        return subType;
    }

    static String datetimeFormat = "yyyy-MM-dd HH:mm:ss";
    static String dateFormat = "yyyy-MM-dd";
    static String timeFormat = "HH:mm:ss";
    static String timeZone = "GMT+8";
    static TimeZone timeZoneR = TimeZone.getTimeZone(timeZone);

}
