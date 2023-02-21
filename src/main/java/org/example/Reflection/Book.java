package org.example.Reflection;

public class Book {
    private final String title;
    private final String author;
    private final Integer pagesAmount;

    public Book() {
        this.title = "";
        this.author = "";
        this.pagesAmount = 0;
    }

    public Book(String title, String author, Integer pagesAmount) {
        this.title = title;
        this.author = author;
        this.pagesAmount = pagesAmount;
    }

    private void printInfo() {
        System.out.println(getBookInfo());
    }

    private String someMethodWithParameters(String str, Integer integer, String something, Double d) {
        return str + " " + integer + " " + something + " " + d;
    }

    public String getBookInfo() {
        return this.title + " by: " + this.author + " pages: " + this.pagesAmount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPagesAmount() {
        return pagesAmount;
    }
}
