package org.wemeet.service.repository.jooq;

import java.util.List;

public interface JooqRepository<T> {

    default T save(T tablePojo) {
        return null;
    }

    default T update(T tablePojo, int id) {
        return null;
    }

    default List<T> findAll() {
        return null;
    }

    default T findById(int id) {
        return null;
    }

    default boolean deleteById(int id) {
        return false;
    }
}
