package org.example.DataAccessObject;

public class AppLogic {
    private final DAO<Client> clientsDAO;

    public AppLogic(DAO<Client> clientsDAO) {
        this.clientsDAO = clientsDAO;
    }

    public void testDAO() {
        clientsDAO.create(new Client("Mateusz", "Zawistowski", 1999, "Legionowo"));
        System.out.println(clientsDAO.read(0));
    }
}
