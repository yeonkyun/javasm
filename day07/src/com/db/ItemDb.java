package com.db;

import java.awt.*;

public class ItemDb implements Db {
    @Override
    public void create(Object obj) {
        Item item = (Item) obj;
        System.out.println(item.getId());
        System.out.println("ItemDb create: " + item);
    }

    @Override
    public void read(Object obj) {
        Item item = (Item) obj;
        System.out.println("ItemDb read: " + item);
    }

    @Override
    public void update(Object obj) {
        Item item = (Item) obj;
        System.out.println("ItemDb update: " + item);
    }

    @Override
    public void delete(Object obj) {
        String id = (String) obj;
        System.out.println("ItemDb delete: " + id);
    }
}
