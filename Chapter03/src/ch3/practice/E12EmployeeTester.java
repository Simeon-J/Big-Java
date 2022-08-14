package ch3.practice;

public class E12EmployeeTester {
    public static void main(String[] args) {
        Employee Bob = new Employee("Bob", 100000);
        System.out.println(Bob.name);
        System.out.println(Bob.salary);

        Bob.raiseSalary(25);
        System.out.println(Bob);
    }
}
