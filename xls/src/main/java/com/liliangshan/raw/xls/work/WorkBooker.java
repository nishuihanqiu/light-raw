package com.liliangshan.raw.xls.work;

import com.liliangshan.raw.common.Record;
import com.liliangshan.raw.common.column.Column;
import com.liliangshan.raw.core.Booker;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

/************************************
 * WorkBooker
 * @author liliangshan
 * @date 2019/8/31
 ************************************/
public class WorkBooker implements Booker<Workbook> {

    private Workbook workbook;

    @Override
    public Booker createWorkBook(String name) {
//        workbook =
        return this;
    }

    @Override
    public Booker createSheet(String name, List<Record> records) {
        return this;
    }

    @Override
    public Booker createSheet(String name, int position, List<Record> records) {
        return this;
    }

    @Override
    public Booker createRow(Record record) {
        return this;
    }

    @Override
    public Booker createCell(Column column) {
        return this;
    }

    @Override
    public Workbook build() {
        return null;
    }

}
