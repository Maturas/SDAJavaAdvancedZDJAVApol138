package org.example.Files.TXT;

import java.util.List;

// TODO Implement a user interface, where you can:
// 1. Display the list of TODOs
// 2. Add a new TODO
// 3. Remove a selected TODO
public class ToDoList {
    private static String filePath = "D:\\ToDo.txt";

    public static void test() {
        ToDoListDAO dao = new ToDoListDAO(filePath);
        // dao.create("Write my first files program in Java.");
        // dao.create("Have a tea.");
        // dao.create("Listen to music.");

        dao.delete(0);

        List<String> lines = dao.read();
        for (Integer i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ". " + lines.get(i));
        }
    }
}
