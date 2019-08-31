package com.liliangshan.raw.xls;

import com.liliangshan.raw.core.Booker;
import com.liliangshan.raw.core.spi.Writer;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/************************************
 * BookWriter
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public abstract class BookWriter<T> implements Writer<Book> {

    private OutputStream outputStream;
    private volatile AtomicBoolean closed = new AtomicBoolean(false);
    private Booker<T> booker;

    public BookWriter(File file, Booker<T> booker) throws FileNotFoundException {
        this(new FileOutputStream(file), booker);
    }

    public BookWriter(String path, Booker<T> booker) throws FileNotFoundException {
        this(new File(path), booker);
    }

    public BookWriter(OutputStream outputStream, Booker<T> booker) {
        this.outputStream = outputStream;
        this.booker = booker;
    }

    @Override
    public void write(Book data) throws IOException {
        if (closed.get()) {
            throw new IOException("writer has closed.");
        }
        List<BookSheet> bookSheets = data.getBookSheets();
        if (bookSheets.isEmpty()) {
            return;
        }
        Collections.sort(bookSheets);

        this.write(outputStream, booker.build());
    }

   abstract protected void write(OutputStream outputStream, T o) throws IOException;

    @Override
    public void flush() throws IOException {
        if (closed.get()) {
            return;
        }
        outputStream.flush();
    }

    @Override
    public boolean available() {
        return !closed.get();
    }

    @Override
    public void close() throws IOException {
        if (closed.get()) {
            return;
        }
        if (outputStream != null) {
            outputStream.close();
        }
        closed.set(true);
    }

}
