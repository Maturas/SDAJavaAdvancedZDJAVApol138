package org.example.Files.JSON;

import com.google.gson.Gson;
import org.example.Files.DAO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookJSONDAO implements DAO<Book> {
    private final String filePath;

    public BookJSONDAO(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Boolean create(Book newObj) {
        List<Book> books = read();
        books.add(newObj);
        return serializeBooksToFile(books);
    }

    @Override
    public Optional<Book> read(Integer id) {
        List<Book> books = read();
        if (id >= 0 && id < books.size()) {
            return Optional.ofNullable(books.get(id));
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public List<Book> read() {
        try {
            String json = Files.readString(Paths.get(this.filePath));
            Book[] books = new Gson().fromJson(json, Book[].class);

            if (books == null) {
                return new ArrayList<>();
            }
            else {
                return new ArrayList<>(List.of(books));
            }
        }
        catch (IOException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Boolean delete(Integer id) {
        List<Book> books = read();

        if (id >= 0 && id < books.size()){
            books.remove((int) id);
            serializeBooksToFile(books);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean delete(Book objToDelete) {
        List<Book> books = read();
        if (books.remove(objToDelete)) {
            serializeBooksToFile(books);
            return true;
        }
        else {
            return false;
        }
    }

    private Boolean serializeBooksToFile(List<Book> books) {
        try {
            FileWriter fileWriter = new FileWriter(this.filePath, false);

            String json = new Gson().toJson(books);
            fileWriter.write(json);

            fileWriter.close();
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
}
