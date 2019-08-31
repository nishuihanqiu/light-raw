package com.liliangshan.raw.core;

import com.liliangshan.raw.common.Record;
import com.liliangshan.raw.common.column.Column;
import com.liliangshan.raw.common.exception.RawArgumentException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/************************************
 * DefaultRecord
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class DefaultRecord implements Record {

    private static final int RECORD_AVERAGE_COLUMN_NUMBER = 16;
    private List<Column> columns;
    private Long id;
    private boolean head;

    public DefaultRecord(long id) {
        this(id, false);
    }

    public DefaultRecord(long id, boolean head) {
        if (id < 0) {
            throw new RawArgumentException("id must be gte 0");
        }
        this.id = id;
        columns = new ArrayList<>(RECORD_AVERAGE_COLUMN_NUMBER);
        this.head = head;
    }

    @Override
    public void addColumn(Column column) {
        columns.add(column);
    }

    @Override
    public void setColumn(int index, Column column) {
        if (index < 0) {
            throw new RawArgumentException("不能给index小于0的column设置值");
        }

        if (index >= columns.size()) {
            expandCapacity(index + 1);
        }
        this.columns.set(index, column);
    }

    @Override
    public Column getColumn(int index) {
        if (index < 0 || index >= columns.size()) {
            return null;
        }
        return columns.get(index);
    }

    @Override
    public List<Column> getColumns() {
        return columns;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public boolean isHead() {
        return head;
    }

    @Override
    public boolean isEmpty() {
        return columns.isEmpty();
    }

    private void expandCapacity(int totalSize) {
        if (totalSize <= 0) {
            return;
        }

        int needToExpand = totalSize - columns.size();
        while (needToExpand-- > 0) {
            this.columns.add(null);
        }
    }

    @Override
    public int compareTo(Record o) {
        return id.compareTo(o.getId());
    }

    @Override
    public Iterator<Column> iterator() {
        return columns.iterator();
    }

}
