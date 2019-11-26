package org.uranussoftware.petclinic.services.map;

import org.uranussoftware.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void delete(T object) {
        // no need to iterate through map anymore
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    // handle IDs locally
    // helper returning the next available ID
    // must make the ID type extend the Long boxed type
    private Long getNextId() {
        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
