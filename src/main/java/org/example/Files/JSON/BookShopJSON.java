package org.example.Files.JSON;

import org.example.Files.DAO;

public class BookShopJSON {
    private static String filePath = "D:\\Books.json";

    public static void example() {
        DAO<Book> bookDAO = new BookJSONDAO(filePath);

        bookDAO.create(new Book("Pan Tadeusz", "Adam Mickiewicz", 2023, 400, 100.5));
        bookDAO.create(new Book("Harry Potter", "JK Rowling", 2001, 300, 1000.0));
        bookDAO.create(new Book("Bible", "God", -4000, 1000, 8000000.0));

        for (Book book : bookDAO.read()) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
    }
}
