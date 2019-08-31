package com.liliangshan.raw.core;

import com.liliangshan.raw.common.Record;
import com.liliangshan.raw.common.column.Column;

import java.util.List;

/************************************
 * Booker
 * @author liliangshan
 * @date 2019/8/31
 ************************************/
public interface Booker<T> {

    Booker createWorkBook(String name);

    Booker createSheet(String name, List<Record> records);

    Booker createSheet(String name, int position, List<Record> records);

    Booker createRow(Record record);

    Booker createCell(Column column);

    T build();

}
