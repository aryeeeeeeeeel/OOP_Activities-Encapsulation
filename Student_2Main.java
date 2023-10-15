    public class Student_2Main {

        public static void main(String[] args) {
            Student_2 student1 = new Student_2(11122333, "John");
            Student_2 student2 = new Student_2(223355, "Aby");
            Student_2 student3 = new Student_2(456789, "Mike");

            java.util.Date dateCreated = student1.getDateCreated();
            dateCreated.setTime(200000);
            
            //java.util.Date dateCreated2 = student2.getDateCreated();
            //dateCreated2.setTime(300000);
            
            //java.util.Date dateCreated3 = student3.getDateCreated();
            //dateCreated3.setTime(400000);

    System.out.println("Student 1 ID: " + student1.getId());
        System.out.println("Student 1 Name: " + student1.getName());
            System.out.println("Student 1 Date Created: " + student1.getDateCreated());
                System.out.println();
                
    System.out.println("Student 2 ID: " + student2.getId());
        System.out.println("Student 2 Name: " + student2.getName());
            System.out.println("Student 2 Date Created: " + student2.getDateCreated());
                System.out.println();
                
    System.out.println("Student 3 ID: " + student3.getId());
        System.out.println("Student 3 Name: " + student3.getName());
            System.out.println("Student 3 Date Created: " + student3.getDateCreated());
                System.out.println();
        }
    }