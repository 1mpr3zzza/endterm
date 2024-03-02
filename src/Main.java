import java.util.ArrayList;
import java.util.List;

// Интерфейс для оценок
interface Gradeable {
    void setGrade(int grade);
    int getGrade();
}

// Базовый класс для студентов
class Student implements Gradeable {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Другие методы и свойства студента
}

// Класс для управления группой студентов
class StudentGroup {
    private List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudentInfo() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Grade: " + student.getGrade());
        }
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 22);

        student1.setGrade(85);
        student2.setGrade(90);

        StudentGroup group = new StudentGroup();
        group.addStudent(student1);
        group.addStudent(student2);

        group.displayStudentInfo();
    }
}
