package com.liliangshan.raw.csv;

import com.liliangshan.raw.common.Record;
import java.util.Collections;
import java.util.List;

/************************************
 * CsvBook
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class CsvBook {

    private static final String DEFAULT_SEPARATOR = ",";

    private String name;
    private List<Record> rows;
    private String separator;

    public CsvBook(String name) {
        this(name, Collections.emptyList());
    }

    public CsvBook(String name, List<Record> rows) {
        this(name, rows, DEFAULT_SEPARATOR);
    }

    public CsvBook(String name, List<Record> rows, String separator) {
        this.name = name;
        this.rows = rows;
        this.separator = separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }

    public List<Record> getRows() {
        return rows;
    }

    public String getName() {
        return name;
    }

}
