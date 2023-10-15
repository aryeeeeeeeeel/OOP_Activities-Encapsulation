import java.time.LocalDate;

class EmployeeMain {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));

        System.out.println("Employee 1");
        displayEmployeeInfo(employee1);

        System.out.println("\nEmployee 2");
        displayEmployeeInfo(employee2);

        System.out.println("\nEmployee 3");
        displayEmployeeInfo(employee3);
    }

        public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: P" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());
    }
}