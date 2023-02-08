package org.example.DataAccessObject;

import java.util.Optional;

public class AppLogic {
    private final DAO<Client> clientsDAO;

    public AppLogic(DAO<Client> clientsDAO) {
        this.clientsDAO = clientsDAO;
    }

    public void testDAO() {
        clientsDAO.create(new Client("Mateusz", "Zawistowski", 1999, "Legionowo"));
        Optional<Client> optionalClient = clientsDAO.read(0);

        if (optionalClient.isPresent()) {
            // Optional contains a value
            Client client = optionalClient.get();
            System.out.println(client.getName());
        }
        else {
            System.out.println("Client with ID 0 not found!");
        }

        // isEmpty is the opposite of isPresent
    }
}
