package org.example.DataAccessObject;

public class FakeClientDAO extends FakeDAO<Client> {
    public Client read(String name, String lastName) {
        for (Client client : this.elements) {
            if (client.getName().equals(name) && client.getLastName().equals(lastName)) {
                return client;
            }
        }
        return null;
    }
}
