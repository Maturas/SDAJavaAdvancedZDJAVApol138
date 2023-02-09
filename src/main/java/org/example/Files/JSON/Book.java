package org.example.Files.JSON;

public class Book {
    private final String title;
    private final String author;
    private final Integer releaseYear;
    private final Integer pagesAmount;
    private final Double soldAmountInMillions;

    public Book(String title, String author, Integer releaseYear, Integer pagesAmount, Double soldAmountInMillions) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pagesAmount = pagesAmount;
        this.soldAmountInMillions = soldAmountInMillions;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Integer getPagesAmount() {
        return pagesAmount;
    }

    public Double getSoldAmountInMillions() {
        return soldAmountInMillions;
    }
}
