package org.example.Files.CSV;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.example.Files.DAO;

import java.io.FileReader;
import java.io.FileWriter;
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
        String[] record = newObj.toRecord();
        return appendRecordToFile(record);
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
        List<String[]> records = readAllRecordsFromFile();
        ArrayList<Book> books = new ArrayList<>();

        for (String[] record : records) {
            try {
                Book book = new Book(record);
                books.add(book);
            }
            catch (IllegalArgumentException e) {
                continue;
            }
        }

        return books;
    }

    @Override
    public Boolean delete(Integer id) {
        List<String[]> records = readAllRecordsFromFile();

        if (id >= 0 && id < records.size()) {
            records.remove((int) id);
            return writeRecordsToFile(records);
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean delete(Book objToDelete) {
        String[] record = objToDelete.toRecord();
        List<String[]> records = readAllRecordsFromFile();

        for (int i = 0; i < records.size(); i++) {
            String[] anotherRecord = records.get(i);

            if (areRecordsEqual(record, anotherRecord)) {
                records.remove(i);
                return writeRecordsToFile(records);
            }
        }

        return false;
    }

    private static Boolean areRecordsEqual(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (Integer i = 0; i < a.length; i++) {
            String strA = a[i];
            String strB = b[i];

            if (!strA.equals(strB))
                return false;
        }

        return true;
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

    private Boolean appendRecordToFile(String[] record) {
        try {
            FileWriter fileWriter = new FileWriter(this.filePath, true);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            csvWriter.writeNext(record);
            csvWriter.close();
            fileWriter.close();

            return true;
        }
        catch (IOException e) {
            return false;
        }
    }

    private Boolean writeRecordsToFile(List<String[]> records) {
        try {
            FileWriter fileWriter = new FileWriter(this.filePath, false);
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            csvWriter.writeAll(records);

            csvWriter.close();
            fileWriter.close();

            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
}
