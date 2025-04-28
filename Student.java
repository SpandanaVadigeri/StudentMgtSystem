public class Student { 
    private int id; 
    private String name; 
    private String grade; 
 
    public Student(int id, String name, String grade) { 
        this.id = id; 
        this.name = name; 
        this.grade = grade; 
    } 
 
    public int getId() { return id; } 
    public String getName() { return name; } 
    public String getGrade() { return grade; } 
 
    @Override 
    public String toString() { 
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade; 
    } 
} 