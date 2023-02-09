package org.example.Files.TXT;

import org.example.Files.DAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToDoListDAO implements DAO<String> {
    private final String filePath;

    public ToDoListDAO(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Boolean create(String newObj) {
        return null;
    }

    @Override
    public Optional<String> read(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<String> read() {
        return null;
    }

    @Override
    public Boolean delete(String objToDelete) {
        return null;
    }

    private Optional<String> readTextFromFile() {
        try {
            String contents = Files.readString(Paths.get(this.filePath));
            if (contents.isBlank()) {
                return Optional.empty();
            }
            else {
                return Optional.of(contents);
            }
        }
        catch (IOException e) {
            return Optional.empty();
        }
    }

    private ArrayList<String> readLinesFromFile() {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
        }
        catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private Optional<String> readLineFromFile(Integer lineIndex) {
        ArrayList<String> lines = readLinesFromFile();
        if (lineIndex >= 0 && lineIndex < lines.size()) {
            return Optional.of(lines.get(lineIndex));
        }
        else {
            return Optional.empty();
        }
    }
}
