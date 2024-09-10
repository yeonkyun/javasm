package dto;

public class Customer {
    private String id;
    private String pw;
    private String name;

    public Customer() {
    }

    public Customer(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", pwd='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
