package ch3.practice;

/**
 *An employee of a company
 */
public class Employee {
    public String name;
    public double salary;

    /**
     * Constructs an employee with a name and
     * @param employeeName name of employee
     * @param currentSalary employee salary
     */
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    /**
     * Returns string of the employee's name
     * @return employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns double of employee's current salary
     * @return salary of employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Raises the employee's salary by the percent given
     * @param byPercent percent to raise salary
     */
    public void raiseSalary(double byPercent) {
        salary += (salary * (byPercent / 100));
    }

    /**
     * Returns a string representation of employee stats
     * @return string of employee stats
     */
    public String toString() {
        return "Employee name: " + name + "\nEmployee salary: " + salary;
    }
}
