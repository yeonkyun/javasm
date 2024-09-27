package edu.sunmoon.frame;

import java.util.List;

public interface Mservice<K, V> {
    V add(V v) throws Exception;
    V modify(V v) throws Exception;
    Boolean remove(K k) throws Exception;
    V get(K k) throws Exception;
    List<V> get() throws Exception;
}
