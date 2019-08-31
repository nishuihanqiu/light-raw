package com.liliangshan.raw.xls.work;

import com.liliangshan.raw.core.Booker;
import com.liliangshan.raw.xls.BookWriter;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/************************************
 * WorkbookWriter
 * @author liliangshan
 * @date 2019/8/31
 ************************************/
public class WorkbookWriter extends BookWriter<Workbook> {


    public WorkbookWriter(File file, Booker<Workbook> booker) throws FileNotFoundException {
        super(file, booker);
    }

    public WorkbookWriter(String path, Booker<Workbook> booker) throws FileNotFoundException {
        super(path, booker);
    }

    public WorkbookWriter(OutputStream outputStream, Booker<Workbook> booker) {
        super(outputStream, booker);
    }

    @Override
    protected void write(OutputStream outputStream, Workbook o) throws IOException {
        o.write(outputStream);
    }


}
