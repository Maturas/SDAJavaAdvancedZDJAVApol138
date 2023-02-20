package org.example.FunctionalProgramming.Streams;

public class VideoGame {
    private String title;
    private String publisher;
    private String genre;
    private Integer releaseYear;
    private Double soldUnitsInMillions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getSoldUnitsInMillions() {
        return soldUnitsInMillions;
    }

    public void setSoldUnitsInMillions(Double soldUnitsInMillions) {
        this.soldUnitsInMillions = soldUnitsInMillions;
    }

    public VideoGame(String title, String publisher, String genre, Integer releaseYear, Double soldUnitsInMillions) {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.soldUnitsInMillions = soldUnitsInMillions;
    }
}
