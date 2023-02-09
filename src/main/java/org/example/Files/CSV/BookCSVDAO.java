package org.example.Files.CSV;

import com.opencsv.CSVReader;
import org.example.Files.DAO;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookCSVDAO implements DAO<Book> {
    private final String filePath;

    public BookCSVDAO(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Boolean create(Book newObj) {
        return null;
    }

    @Override
    public Optional<Book> read(Integer id) {
        Optional<String[]> record = readRecordFromFile(id);

        if (record.isPresent()) {
            try {
                Book book = new Book(record.get());
                return Optional.of(book);
            }
            catch (IllegalArgumentException e) {
                return Optional.empty();
            }
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public List<Book> read() {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean delete(Book objToDelete) {
        return null;
    }

    private List<String[]> readAllRecordsFromFile() {
        try {
            FileReader fileReader = new FileReader(this.filePath);
            CSVReader csvReader = new CSVReader(fileReader);

            ArrayList<String[]> records = new ArrayList<>(csvReader.readAll());
            csvReader.close();
            fileReader.close();

            return records;
        }
        catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private Optional<String[]> readRecordFromFile(Integer id) {
        List<String[]> records = readAllRecordsFromFile();

        if (id >= 0 && id < records.size()) {
            return Optional.of(records.get(id));
        }
        else {
            return Optional.empty();
        }
    }
}
