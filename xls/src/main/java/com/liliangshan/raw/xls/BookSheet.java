package com.liliangshan.raw.xls;

import com.liliangshan.raw.common.Record;

import java.util.Collections;
import java.util.List;

/************************************
 * BookSheet
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class BookSheet implements Comparable<BookSheet> {

    private String name;
    private Integer position;
    private List<Record> rows;

    public BookSheet(String name) {
        this(name, 0, Collections.emptyList());
    }

    public BookSheet(String name, List<Record> rows) {
        this(name, 0, rows);
    }

    public BookSheet(String name, int position, List<Record> rows) {
        this.name = name;
        this.position = position;
        this.rows = rows;
        Collections.sort(this.rows);
    }

    @Override
    public int compareTo(BookSheet bookSheet) {
        return position.compareTo(bookSheet.position);
    }

    public List<Record> getRows() {
        return rows;
    }

    public String getName() {
        return name;
    }

    public int position() {
        return position;
    }
}
