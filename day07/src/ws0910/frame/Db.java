package ws0910.frame;

import java.util.List;

public interface Db<K, V> {
    void insert(V v) throws Exception;

    void update(V v) throws Exception;

    void delete(K k) throws Exception;

    V select(K k) throws Exception;

    List<V> select() throws Exception;

    default List<V> searchByName(String name) throws Exception {
        return null;
    }

    default List<V> searchById(String id) throws Exception {
        return null;
    }
}