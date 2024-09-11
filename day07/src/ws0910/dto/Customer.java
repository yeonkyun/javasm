package ws0910.dto;

import java.time.LocalDateTime;

public class Customer {
    private String id;
    private String pw;
    private String name;
    private LocalDateTime createdAt;

    // 기본 생성자
    public Customer() {
        // 기본 가입일자를 현재 날짜로 설정
        this.createdAt = LocalDateTime.now();
    }

    public Customer(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public Customer(String id, String pw, String name, LocalDateTime createdAt) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}