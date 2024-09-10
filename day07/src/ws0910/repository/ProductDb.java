package ws0910.repository;

import ws0910.dto.Product;
import ws0910.frame.Db;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDb implements Db<Integer, Product> {
    @Override
    public void insert(Product product) throws Exception {
        System.out.println("Inserted: " + product.getName());
    }

    @Override
    public void update(Product product) throws Exception {
        System.out.println("Updated: " + product.getName());
    }

    @Override
    public void delete(Integer integer) throws Exception {
        System.out.println("Deleted: " + integer);
    }

    @Override
    public Product select(Integer integer) throws Exception {
        Product product = new Product(integer, "product", 1000, "ImageName");
        return product;
    }

    @Override
    public List<Product> select() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "메인보드", 500000, "MotherBoard.jpg"));
        products.add(new Product(2, "CPU", 300000, "CPU.jpg"));
        products.add(new Product(3, "RAM", 200000, "RAM.jpg"));
        products.add(new Product(4, "VGA", 400000, "VGA.jpg"));
        products.add(new Product(5, "SSD", 150000, "SSD.jpg"));
        products.add(new Product(6, "HDD", 80000, "HDD.jpg"));
        products.add(new Product(7, "Power", 100000, "Power.jpg"));
        products.add(new Product(8, "Case", 70000, "Case.jpg"));
        products.add(new Product(9, "Monitor", 300000, "Monitor.jpg"));
        products.add(new Product(10, "Keyboard", 50000, "Keyboard.jpg"));
        products.add(new Product(11, "Mouse", 30000, "Mouse.jpg"));
        products.add(new Product(12, "Speaker", 100000, "Speaker.jpg"));

        return products;
    }

    @Override
    public List<Product> searchByName(String name) throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "메인보드", 500000, "MotherBoard.jpg"));
        products.add(new Product(2, "CPU", 300000, "CPU.jpg"));
        products.add(new Product(3, "RAM", 200000, "RAM.jpg"));
        products.add(new Product(4, "VGA", 400000, "VGA.jpg"));
        products.add(new Product(5, "SSD", 150000, "SSD.jpg"));
        products.add(new Product(6, "HDD", 80000, "HDD.jpg"));
        products.add(new Product(7, "Power", 100000, "Power.jpg"));
        products.add(new Product(8, "Case", 70000, "Case.jpg"));
        products.add(new Product(9, "Monitor", 300000, "Monitor.jpg"));
        products.add(new Product(10, "Keyboard", 50000, "Keyboard.jpg"));
        products.add(new Product(11, "Mouse", 30000, "Mouse.jpg"));
        products.add(new Product(12, "Speaker", 100000, "Speaker.jpg"));

        return products.stream()
                .filter(p -> p.getName().contains(name))
                .collect(Collectors.toList());
    }
}
