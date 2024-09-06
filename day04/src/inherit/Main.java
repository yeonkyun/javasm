package inherit;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John", 50000);
//        Object obj = new Employee(2, "Jane", 60000);
        Manager mgr = new Manager(3, "Jack", 70000, 10000);

        System.out.println(emp.getAnnualSalary());
        System.out.println(mgr.getAnnualSalary());

        System.out.println(emp);
        System.out.println(mgr);


    }
}
