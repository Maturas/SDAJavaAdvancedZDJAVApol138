package org.example.FunctionalProgramming.FunctionChaining;

public class BuilderVideoGame {
    private String title;
    private String producer;
    private String publisher;
    private String genre;
    private Integer releaseYear;
    private Double soldUnitsInMillions;
    private String[] supportedPlatforms;
    private Integer metascore;

    public static void example() {
        BuilderVideoGame game = createNew()
                .setTitle("The Witcher 3")
                .setGenre("Action RPG")
                .setMetascore(90)
                .setPublisher("CD Projekt")
                .setReleaseYear(2015);
    }

    public static BuilderVideoGame createNew() {
        return new BuilderVideoGame();
    }

    public String getTitle() {
        return title;
    }

    public BuilderVideoGame setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public BuilderVideoGame setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public BuilderVideoGame setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public BuilderVideoGame setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public BuilderVideoGame setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public Double getSoldUnitsInMillions() {
        return soldUnitsInMillions;
    }

    public BuilderVideoGame setSoldUnitsInMillions(Double soldUnitsInMillions) {
        this.soldUnitsInMillions = soldUnitsInMillions;
        return this;
    }

    public String[] getSupportedPlatforms() {
        return supportedPlatforms;
    }

    public BuilderVideoGame setSupportedPlatforms(String[] supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
        return this;
    }

    public Integer getMetascore() {
        return metascore;
    }

    public BuilderVideoGame setMetascore(Integer metascore) {
        this.metascore = metascore;
        return this;
    }
}
