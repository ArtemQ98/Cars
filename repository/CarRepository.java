package repository;

import java.util.*;

public interface CarRepository<T, ID> {

    T save(T entry);
    List<T> SaveAll(Collection<T> entities);
    Optional<T> findById(ID id);
    void deleteByID(ID id);
    void deleteAll();
    long count();
    boolean existById(ID id);
}
