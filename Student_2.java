public class Student_2 {
    int id;
    String name;
    java.util.Date dateCreated;

    public Student_2(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}