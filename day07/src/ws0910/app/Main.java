package ws0910.app;

import ws0910.dto.Customer;
import ws0910.dto.Product;
import ws0910.frame.Db;
import ws0910.repository.CustomerDb;
import ws0910.repository.ProductDb;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Customer Test
        Db db = new CustomerDb();
        List<Customer> customers = null;

        // Customer Insert Test
        // 출력 결과: Inserted: 이정진
        Customer customer = new Customer("id11", "pw11", "이정진");

        try {
            db.insert(customer);
        } catch (Exception e) {
            System.out.println("Insert Error");
        }

        // 전체 출력
        // 출력 결과: Customer{id='id01', pw='pw01', name='정연균', createdAt=2024-09-10T22:10:00.596941} ...
        try {
            customers = db.select();
            for (Customer c : customers) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("Select Error");
        }

        // 이름 성이 '이'인 사람 출력
        // 출력 결과: Customer{id='id05', pw='pw05', name='이영희', createdAt=2024-09-10T22:10:00.596941} ...
        try {
            customers = db.searchByName("이");
            for (Customer c : customers) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("Search Error");
        }

        // 아이디 'id01'인 사람 출력
        // 출력 결과: Customer{id='id01', pw='pw01', name='정연균', createdAt=2024-09-10T22:10:00.596941}
        try {
            customers = db.searchById("id01"); // List<Customer>로 반환
            if (customers != null && !customers.isEmpty()) {
                Customer c = customers.get(0); // 첫 번째 고객 가져오기
                System.out.println(c); // 고객 정보 출력
            } else {
                System.out.println("사용자를 찾을 수 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("Search Error");
        }


        // Product Test
        db = new ProductDb();
        List<Product> products = null;

        // Product Insert Test
        // 출력 결과: Inserted: Earphone
        Product product = new Product(13, "Earphone", 10000, "Earphone.jpg");

        // 전체 출력
        // 출력 결과: Product{id=1, name='메인보드', price=500000, imageName='MotherBoard.jpg', createdAt=2024-09-10T22:23:44.101770} ...
        try {
            products = db.select();
            for (Product p : products) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Select Error");
        }

        // 이름에 'C'가 포함된 제품 출력
        // 출력 결과: Product{id=8, name='Case', price=70000, imageName='Case.jpg', createdAt=2024-09-10T22:23:44.101770} ...
        try {
            products = db.searchByName("C");
            for (Product p : products) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Search Error");
        }
    }
}
