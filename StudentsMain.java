class StudentsMain {
    
    public static void main(String[] args){
        
        Students student = new Students ("Ariel S. Sumantin", "IT21C", "Delete System32 but in real-life");
        
        System.out.println("Name: " + student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
}
