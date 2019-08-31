package com.liliangshan.raw.xls;

import java.util.Collections;
import java.util.List;

/************************************
 * Book
 * @author liliangshan
 * @date 2019/8/30
 ************************************/
public class Book {

    private String name;
    private List<BookSheet> bookSheets;

    public Book(String name) {
        this(name, Collections.emptyList());
    }

    public Book(String name, List<BookSheet> bookSheets) {
        this.name = name;
        this.bookSheets = bookSheets;
    }

    public String getName() {
        return name;
    }

    public List<BookSheet> getBookSheets() {
        return bookSheets;
    }

    public void setBookSheets(List<BookSheet> bookSheets) {
        this.bookSheets = bookSheets == null ? Collections.emptyList() : bookSheets;
    }

}
