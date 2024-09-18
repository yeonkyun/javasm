package edu.sunmoon;

import edu.sunmoon.dto.Customer;
import edu.sunmoon.dto.Product;
import edu.sunmoon.dto.Cart;
import edu.sunmoon.service.CustomerService;
import edu.sunmoon.service.ProductService;
import edu.sunmoon.service.CartService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        ProductService productService = new ProductService();
        CartService cartService = new CartService();

        while (true) {
            System.out.println("명령어를 입력하세요 (1: 고객 추가, 2: 고객 삭제, 3: 고객 수정, 4: 상품 추가, 5: 상품 삭제, 6: 상품 수정, 7: 카트에 추가, 8: 카트에서 삭제, 9: 카트 보기, 0: 종료): ");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 1:
                    System.out.println("고객 ID를 입력하세요: ");
                    String customerId = scanner.nextLine();
                    System.out.println("비밀번호를 입력하세요: ");
                    String password = scanner.nextLine();
                    System.out.println("이름을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.println("나이를 입력하세요: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("성별을 입력하세요: ");
                    String gender = scanner.nextLine();
                    System.out.println("이메일을 입력하세요: ");
                    String email = scanner.nextLine();
                    System.out.println("전화번호를 입력하세요: ");
                    String phone = scanner.nextLine();

                    Customer newCustomer = Customer.builder()
                            .id(customerId)
                            .password(password)
                            .name(name)
                            .age(age)
                            .gender(gender)
                            .email(email)
                            .phone(phone)
                            .build();

                    try {
                        customerService.add(newCustomer);
                        System.out.println("고객이 추가되었습니다: " + newCustomer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("삭제할 고객 ID를 입력하세요: ");
                    String deleteCustomerId = scanner.nextLine();

                    try {
                        customerService.remove(deleteCustomerId);
                        System.out.println("고객이 삭제되었습니다: " + deleteCustomerId);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("수정할 고객 ID를 입력하세요: ");
                    String updateCustomerId = scanner.nextLine();
                    System.out.println("새 비밀번호를 입력하세요: ");
                    String newPassword = scanner.nextLine();
                    System.out.println("새 이름을 입력하세요: ");
                    String newName = scanner.nextLine();
                    System.out.println("새 나이를 입력하세요: ");
                    int newAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("새 성별을 입력하세요: ");
                    String newGender = scanner.nextLine();
                    System.out.println("새 이메일을 입력하세요: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("새 전화번호를 입력하세요: ");
                    String newPhone = scanner.nextLine();

                    Customer updatedCustomer = Customer.builder()
                            .id(updateCustomerId)
                            .password(newPassword)
                            .name(newName)
                            .age(newAge)
                            .gender(newGender)
                            .email(newEmail)
                            .phone(newPhone)
                            .build();

                    try {
                        customerService.modify(updatedCustomer);
                        System.out.println("고객 정보가 수정되었습니다: " + updatedCustomer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.println("상품 이름을 입력하세요: ");
                    String productName = scanner.nextLine();
                    System.out.println("상품 가격을 입력하세요: ");
                    int productPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println("생성자를 입력하세요: ");
                    String createdBy = scanner.nextLine();

                    Product newProduct = Product.builder()
                            .name(productName)
                            .price(productPrice)
                            .createdBy(createdBy)
                            .build();

                    try {
                        productService.add(newProduct);
                        System.out.println("상품이 추가되었습니다: " + newProduct);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("삭제할 상품 ID를 입력하세요: ");
                    int deleteProductId = Integer.parseInt(scanner.nextLine());

                    try {
                        productService.remove(deleteProductId);
                        System.out.println("상품이 삭제되었습니다: " + deleteProductId);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    System.out.println("수정할 상품 ID를 입력하세요: ");
                    int updateProductId = Integer.parseInt(scanner.nextLine());
                    System.out.println("새 상품 이름을 입력하세요: ");
                    String newProductName = scanner.nextLine();
                    System.out.println("새 상품 가격을 입력하세요: ");
                    int newProductPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println("새 생성자를 입력하세요: ");
                    String newCreatedBy = scanner.nextLine();

                    Product updatedProduct = Product.builder()
                            .id(updateProductId)
                            .name(newProductName)
                            .price(newProductPrice)
                            .createdBy(newCreatedBy)
                            .build();

                    try {
                        productService.modify(updatedProduct);
                        System.out.println("상품 정보가 수정되었습니다: " + updatedProduct);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    System.out.println("고객 ID를 입력하세요: ");
                    String cartCustomerId = scanner.nextLine();
                    System.out.println("상품 ID를 입력하세요: ");
                    int cartProductId = Integer.parseInt(scanner.nextLine());
                    System.out.println("수량을 입력하세요: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    Cart newCart = Cart.builder()
                            .customerId(cartCustomerId)
                            .productId(cartProductId)
                            .quantity(quantity)
                            .build();

                    try {
                        cartService.add(newCart);
                        System.out.println("카트에 상품이 추가되었습니다: " + newCart);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 8:
                    System.out.println("고객 ID를 입력하세요: ");
                    String deleteCartCustomerId = scanner.nextLine();
                    System.out.println("삭제할 카트 ID를 입력하세요: ");
                    int deleteCartId = Integer.parseInt(scanner.nextLine());

                    try {
                        cartService.remove(deleteCartCustomerId, deleteCartId);
                        System.out.println("카트에서 상품이 삭제되었습니다: " + deleteCartId);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 9:
                    System.out.println("고객 ID를 입력하세요: ");
                    String viewCartCustomerId = scanner.nextLine();

                    try {
                        Cart cart = cartService.get(viewCartCustomerId);
                        System.out.println("카트 내용: " + cart);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 명령어입니다. 다시 시도하세요.");
            }
        }
    }
}