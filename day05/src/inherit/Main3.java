package inherit;

public class Main3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(1, "John", 50000);
        employees[1] = new Manager(2, "Jane", 60000, 10000);
        employees[2] = new Employee(3, "Jack", 70000);
        employees[3] = new Manager(4, "Jill", 80000, 20000);

        for (Employee emp : employees) {
            System.out.println(emp.getAnnualSalary());
            System.out.println(emp);

            if (emp instanceof Manager) {
                Manager mgr = (Manager) emp;
                System.out.println(mgr.getBonus());
            }
        }
    }
}
