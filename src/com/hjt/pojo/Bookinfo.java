package com.hjt.pojo;

public class Bookinfo {

    public int id;
    public String bookname;
    public String author;
    public String booktype;
    public String price;
    public String detail;


    public Bookinfo() {
    }

    public Bookinfo(int id, String bookname, String author, String booktype, String price, String detail) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.booktype = booktype;
        this.price = price;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Bookinfo{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", booktype='" + booktype + '\'' +
                ", price='" + price + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
