package org.example.FunctionalProgramming.BuilderDesignPattern;

public class NonBuilderVideoGame {
    private String title;
    private String producer;
    private String publisher;
    private String genre;
    private Integer releaseYear;
    private Double soldUnitsInMillions;
    private String[] supportedPlatforms;
    private Integer metascore;

    public NonBuilderVideoGame(String title, String producer, String publisher, String genre, Integer releaseYear, Double soldUnitsInMillions, String[] supportedPlatforms, Integer metascore) {
        this.title = title;
        this.producer = producer;
        this.publisher = publisher;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.soldUnitsInMillions = soldUnitsInMillions;
        this.supportedPlatforms = supportedPlatforms;
        this.metascore = metascore;
    }

    public static void example() {
        NonBuilderVideoGame game = new NonBuilderVideoGame("Hogwarts Legacy", "Portkey Games", "WB Games", "Action RPG", 2023, 2.0, new String[] { "PC", "Playstation 5", "Xbox Series" }, 86);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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

    public String[] getSupportedPlatforms() {
        return supportedPlatforms;
    }

    public void setSupportedPlatforms(String[] supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public Integer getMetascore() {
        return metascore;
    }

    public void setMetascore(Integer metascore) {
        this.metascore = metascore;
    }
}
