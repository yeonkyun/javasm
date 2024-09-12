package edu.sunmoon.ws0911.entity;

import java.time.LocalDateTime;

public class product {
    private int id;
    private String name;
    private int price;
    private String imageName;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String createBy;

    public product() {
    }

    public product(String name, int price, String imageName, String createBy) {
        this.name = name;
        this.price = price;
        this.imageName = imageName;
        this.createBy = createBy;
    }

    public product(int id, String name, int price, String imageName, LocalDateTime createAt, LocalDateTime updateAt, String createBy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageName = imageName;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createBy = createBy;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
