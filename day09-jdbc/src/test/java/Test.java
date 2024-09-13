import edu.sunmoon.dto.Customer;

public class Test {
    public static void main(String[] args) {
        Customer customer = Customer.builder()
                                    .id("id01")
                                    .pw("pw01")
                                    .build();
        System.out.println(customer);
    }
}
