import java.time.LocalDate;

    class EmployeeArrayMain {
        public static void main(String[] args){
                EmployeeArray[] employees = new EmployeeArray[3];
            
            employees[0] = new EmployeeArray("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
            employees[1] = new EmployeeArray("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
            employees[2] = new EmployeeArray("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
            
            for(int i = 0; i < employees.length; i++){
                System.out.println("Employee " + (i + 1));
                displayEmployeeArrayInfo(employees[i]);
                System.out.println();
            }
        }
        public static void displayEmployeeArrayInfo(EmployeeArray employee){
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: P" + employee.getSalary());
            System.out.println("HireDate: " + employee.getHireDate());
        }
}
