package org.example.Files.TXT;

import org.example.Files.DAO;

import java.io.FileWriter;
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
        return appendLineToFile(newObj);
    }

    @Override
    public Optional<String> read(Integer id) {
        return readLineFromFile(id);
    }

    @Override
    public List<String> read() {
        return readLinesFromFile();
    }

    @Override
    public Boolean delete(Integer id) {
        Optional<String> lineToDelete = readLineFromFile(id);

        if (lineToDelete.isPresent()) {
            return delete(lineToDelete.get());
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean delete(String objToDelete) {
        ArrayList<String> lines = readLinesFromFile();

        if (!lines.remove(objToDelete))
            return false;

        if (!writeTextToFile(""))
            return false;

        for (String line : lines) {
            if (!appendLineToFile(line))
                return false;
        }

        return true;
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).isBlank()) {
                    lines.remove(i);
                    i--;
                }
            }

            return lines;
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

    private Boolean appendLineToFile(String line) {
        try {
            FileWriter writer = new FileWriter(this.filePath, true);

            writer.append(line);
            writer.append("\n");
            writer.close();

            return true;
        }
        catch (IOException e) {
            return false;
        }
    }

    private Boolean writeTextToFile(String text) {
        try {
            FileWriter writer = new FileWriter(this.filePath, false);

            writer.write(text);
            writer.close();

            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
}
