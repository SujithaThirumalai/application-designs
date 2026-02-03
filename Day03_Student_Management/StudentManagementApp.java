import java.util.ArrayList;

class Student {
    int id;
    String name;
    String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    int studentIdCounter = 1;

    public void addStudent(String name, String department) {
        students.add(new Student(studentIdCounter++, name, department));
    }

    public void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            System.out.println(s.id + " | " + s.name + " | " + s.department);
        }
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("Arun", "CSE");
        manager.addStudent("Meena", "ECE");

        manager.getAllStudents();

        Student s = manager.findStudentById(1);
        if (s != null) {
            System.out.println("Found: " + s.name);
        } else {
            System.out.println("Student not found");
        }
    }
}
