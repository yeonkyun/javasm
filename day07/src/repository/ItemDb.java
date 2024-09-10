package repository;

import dto.Item;
import frame.Db;

import java.util.ArrayList;
import java.util.List;

public class ItemDb implements Db<Integer, Item> {
    @Override
    public void insert(Item item) throws Exception {
        System.out.println("Inserted: " + item.getName());
    }

    @Override
    public void update(Item item) throws Exception {
        System.out.println("Updated: " + item.getName());
    }

    @Override
    public void delete(Integer integer) throws Exception {
        System.out.println("Deleted: " + integer);
    }

    @Override
    public Item select(Integer integer) throws Exception {
        Item item = new Item(integer, "item", 1000);
        return item;
    }

    @Override
    public List<Item> select() throws Exception {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "item01", 1000));
        items.add(new Item(2, "item02", 2000));
        items.add(new Item(3, "item03", 3000));
        items.add(new Item(4, "item04", 4000));
        items.add(new Item(5, "item05", 5000));
        return items;
    }
}
