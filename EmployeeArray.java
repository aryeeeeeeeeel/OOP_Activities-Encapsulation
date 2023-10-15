import java.time.LocalDate;

class EmployeeArray {    //Ariel S. Sumantin
    private final String name;
    private final double salary;
    private final LocalDate hireDate;

    protected EmployeeArray(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    protected String getName() {
        return name;
    }

    protected  double getSalary() {
        return salary;
    }

    protected  LocalDate getHireDate() {
        return hireDate;
    }
}