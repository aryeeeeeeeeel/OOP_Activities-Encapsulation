import java.time.LocalDate;

class Employee {    
    private final String name;
    private final double salary;
    private final LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}