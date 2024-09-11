package ws0910.dto;

import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private int price;
    private String imageName;
    private LocalDateTime createdAt;

    public Product() {
        this.createdAt = LocalDateTime.now();
    }

    public Product(int id, String name, int price, String imageName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageName = imageName;
        this.createdAt = LocalDateTime.now();
    }

    public Product(int id, String name, int price, String imageName, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageName = imageName;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageName() {
        return imageName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", imageName='" + imageName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}