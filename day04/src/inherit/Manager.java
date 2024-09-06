package inherit;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(int empNo, String name, double salary, double bonus) {
        super(empNo, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    //    @Override
//    public String toString() {
//        return "Manager{" +
//                "bonus=" + bonus +
//                "} " + super.toString();
//    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                "empNo=" + empNo + // == super.empNo
//                ", name='" + name + '\'' + // protected를 사용하여 상속받은 필드
//                ", salary=" + salary +
//                ", bonus=" + bonus +
//                '}';
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "empNo=" + getEmpNo() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + this.bonus;
    }
}