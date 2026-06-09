import java.io.Serializable; // this class is allowed to be freeze-dried and stored in a file.
import java.io.Serial;// special marker that tells java pay attention to what comes next


public class Student implements Serializable {
    @Serial // the special marker or annotation
    private static final long serialVersionID = 1L;

    private String studentId;
    private String name;
    private String department;
    private double gpa;

// Constructor
    public Student(String studentId, String name, String department, double gpa){
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }
// Getters
    public String getStudentId(){
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }
// Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return String.format("ID: %s | Name: %s | Dept: %s | GPA: %.2f" , studentId, name, department, gpa );
    }

    public String toFileString(){
        return studentId + "," + name + "," + department + "," + gpa;
    }

    public static Student fromFileString(String line){
        String[] parts = line.split(",");
        return new Student(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]));
    }

}
