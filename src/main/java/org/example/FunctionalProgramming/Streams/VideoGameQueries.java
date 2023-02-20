package org.example.FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class VideoGameQueries {
    public static List<VideoGame> games;

    public static void init() {
        games = new ArrayList<>();
        games.add(new VideoGame("Assasin's Creed", "Ubisoft", "Action RPG", 2008, 50.0));
        games.add(new VideoGame("Metal Gear Solid 3", "Konami", "Stealth Action", 2004, 40.0));
        games.add(new VideoGame("The Witcher 3", "CD Projekt", "Action RPG", 2015, 100.0));
        games.add(new VideoGame("Metal Gear Solid V", "Konami", "Stealth Action", 2015, 35.0));
        games.add(new VideoGame("Portal 2", "Valve", "Puzzle", 2010, 80.0));
        games.add(new VideoGame("Spelunky", "Indie", "Roguelike", 2012, 3.0));
    }

    // return game of given title
    public static Optional<VideoGame> getByTitle(String title) {
        /* Implemented with a for loop
        for (VideoGame game : games) {
            if (game.getTitle().equals(title)) {
                return Optional.of(game);
            }
        }
        return Optional.empty();
        */

        // Implemented with streams
        return games.stream().filter(game -> game.getTitle().equals(title)).findFirst();
    }

    // return all games from given publisher
    public static List<VideoGame> getByPublisher(String publisher) {
        /*
        List<VideoGame> games = new ArrayList<>();
        for (VideoGame game : games) {
            if (game.getPublisher().equals(publisher)) {
                games.add(game);
            }
        }
        return games;
        */

        return games.stream().filter(game -> game.getPublisher().equals(publisher)).toList();
    }

    // return best-selling game (most units sold)
    public static Optional<VideoGame> getBestSelling() {
        /*
        VideoGame bestSeller = null;
        for (VideoGame game : games) {
            if (bestSeller == null || bestSeller.getSoldUnitsInMillions() < game.getSoldUnitsInMillions()) {
                bestSeller = game;
            }
        }
        return Optional.ofNullable(bestSeller);
        */

        // max - parameter: Comparator (comparing function)
        // Comparing function of two values, return values: -1 - lower, 0 - equal, 1 - greater
        // Comparator - class containing pre-made comparator functions for most known types
        // Comparator takes a parameter called Extractor
        // Extractor - function, which for a set of objects from the same type, extracts a value to compare to
        return games.stream().max(Comparator.comparingDouble(VideoGame::getSoldUnitsInMillions));
    }

    // return earliest released game (least year released)
    public static Optional<VideoGame> getEarliestReleased() {
        /*
        VideoGame earliestRelease = null;
        for (VideoGame game : games) {
            if (earliestRelease == null || earliestRelease.getReleaseYear() > game.getReleaseYear()) {
                earliestRelease = game;
            }
        }
        return Optional.ofNullable(earliestRelease);
        */

        return games.stream().min(Comparator.comparingInt(VideoGame::getReleaseYear));
    }

    // return a list of all titles
    public static List<String> getTitles() {
        /*
        List<String> titles = new ArrayList<>();
        for (VideoGame game : games) {
            titles.add(game.getTitle());
        }
        return titles;
        */

        // Stream-based solution with lambda syntax
        // return games.stream().map(game -> game.getTitle()).toList();

        // Stream-based solution with method reference
        return games.stream().map(VideoGame::getTitle).toList();
    }

    public static List<VideoGame> getSortedByTitles() {
        return games.stream().sorted(Comparator.comparing(VideoGame::getTitle)).toList();
    }

    // Ascending vs Descending
    // Ascending - from least to greatest (0 -> 10)
    // Descending - from greatest to least (10 -> 0)

    public static List<VideoGame> getSortedByUnitsSoldAsc() {
        return games.stream().sorted(Comparator.comparingDouble(VideoGame::getSoldUnitsInMillions)).toList();
    }

    public static List<VideoGame> getSortedByUnitsSoldDesc() {
        return games.stream().sorted(Comparator.comparingDouble(VideoGame::getSoldUnitsInMillions).reversed()).toList();
    }

    // set sold units to 0 for each video game
    public static void resetAllUnitsSoldValues() {
        games.forEach(game -> game.setSoldUnitsInMillions(0.0));
    }

    // get titles of all games from given publisher, sorted descending by their release year
    public static List<String> getTitlesFromPublisherByReleaseYearDesc(String publisher) {
        // proper order of functions: filter -> sorted -> map

        // map cannot be first, because we lose the data used for filtering and sorting
        // sorted shouldn't be first, because then we would be unnecessarily sorting objects, which will be then filtered out

        return games.stream().filter(game -> game.getPublisher().equals(publisher)) // Filter out all games that are not from given publisher
                .sorted(Comparator.comparingInt(VideoGame::getReleaseYear).reversed()) // Sort the remaining games by their release year, top to bottom
                .map(VideoGame::getTitle).toList(); // From each of this game, take its title, and return them in a list
    }

    public static void optionalIfPresentExample() {
        /* Implementation with if-else statement
        Optional<VideoGame> game = getByTitle("Ori and the Blind Forest");
        if (game.isPresent()) {
            System.out.println(game.get().getTitle());
        }
        else {
            System.out.println("NOT FOUND!");
        }
        */

        // Functional implementation
        getByTitle("Ori and the Blind Forest")
                .ifPresentOrElse(game -> System.out.println(game.getTitle()),
                        () -> System.out.println("NOT FOUND!"));
    }
}
