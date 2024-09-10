package com.db;

public interface Db {
    void create(Object obj);
    void read(Object obj);
    void update(Object obj);
    void delete(Object obj);
}
