package com.liliangshan.raw.common;

import com.liliangshan.raw.common.column.Column;
import java.util.List;

/************************************
 * Record
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public interface Record extends Iterable<Column>, Comparable<Record> {

    void addColumn(Column column);

    void setColumn(int index, Column column);

    Column getColumn(int index);

    List<Column> getColumns();

    Long getId();

    boolean isHead();

    boolean isEmpty();

}
