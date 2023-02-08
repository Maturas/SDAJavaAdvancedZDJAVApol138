package org.example.DataAccessObject;

import java.util.Optional;

public class FakeClientDAO extends FakeDAO<Client> {
    public Optional<Client> read(String name, String lastName) {
        for (Client client : this.elements) {
            if (client.getName().equals(name) && client.getLastName().equals(lastName)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
