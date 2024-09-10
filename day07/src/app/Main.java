package app;

import dto.Customer;
import dto.Item;
import frame.Db;
import repository.CustomerDb;
import repository.ItemDb;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Db db = new CustomerDb();
        Customer customer = new Customer("id01", "pw01", "James");
        try {
            db.insert(customer);
        } catch (Exception e) {
            System.out.println("Insert Error");
        }

        String id = "id01";
        Customer c = null;
        try {
            c = (Customer) db.select(id);
        } catch (Exception e) {
            System.out.println("Select Error");
        }
        System.out.println(c);

        List<Customer> customers = null;
        try {
            customers = db.select();
        } catch (Exception e) {
            System.out.println("Select Error");
        }
        for (Customer cust : customers) {
            System.out.println(cust);
        }

        db = new ItemDb();
        Item item = new Item(1, "item01", 1000);
        try {
            db.insert(item);
        } catch (Exception e) {
            System.out.println("Insert Error");
        }

        try {
            db.searchByName("name");
            for (Customer cust : customers) {
                System.out.println(cust);
            }
        } catch (Exception e) {
            System.out.println("Search Error");
        }

        List<Item> items = null;
        try {
            items = db.select();
        } catch (Exception e) {
            System.out.println("Select Error");
        }
        for (Item i : items) {
            System.out.println(i);
        }
    }
}
