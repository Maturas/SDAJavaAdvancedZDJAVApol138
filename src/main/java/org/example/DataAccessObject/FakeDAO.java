package org.example.DataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class FakeDAO<T> implements DAO<T> {
    protected final List<T> elements;

    public FakeDAO() {
        this.elements = new ArrayList<>();
    }

    @Override
    public Boolean create(T newObj) {
        if (this.elements.contains(newObj)) {
            return false;
        }
        else {
            this.elements.add(newObj);
            return true;
        }
    }

    @Override
    public T read(Integer id) {
        if (id >= 0 && id < this.elements.size()) {
            return this.elements.get(id);
        }
        else {
            return null;
        }
    }

    @Override
    public List<T> read() {
        return new ArrayList<>(this.elements);
    }

    @Override
    public Boolean update(Integer id, T updatedObj) {
        if (id >= 0 && id < this.elements.size()) {
            this.elements.set(id, updatedObj);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean delete(Integer id) {
        if (id >= 0 && id < this.elements.size()) {
            this.elements.remove((int) id);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean delete(T objToDelete) {
        if (this.elements.contains(objToDelete)) {
            this.elements.remove(objToDelete);
            return true;
        }
        else {
            return false;
        }
    }
}
