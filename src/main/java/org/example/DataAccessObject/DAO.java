package org.example.DataAccessObject;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    // CRUD
    // Create - creation of a new object in the data source
    // Read - read selected object (or objects) from the data source
    // Update - change values of selected object in the data source
    // Delete - delete selected object from the data source

    Boolean create(T newObj);
    Optional<T> read(Integer id);
    List<T> read();
    Boolean update(Integer id, T updatedObj);
    Boolean delete(Integer id);
    Boolean delete(T objToDelete);
}
