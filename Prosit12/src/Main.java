import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ali", 20));
        students.add(new Student(1, "Sara", 22));
        students.add(new Student(2, "Mouna", 21));

        System.out.println("Tous les étudiants :");
        sm.displayStudents(students, System.out::println);

        System.out.println("Étudiants avec âge > 20 :");
        sm.displayStudentsByFilter(students, s -> s.getAge() > 20, System.out::println);
        String noms = sm.returnStudentsNames(students, Student::getNom);
        System.out.println("Noms des étudiants : " + noms);


        Student newStudent = sm.createStudent(() -> new Student(4, "Youssef", 23));
        students.add(newStudent);

        Comparator<Student> comparatorById = (s1, s2) -> s1.getId() - s2.getId();
        sm.sortStudentsById(students, comparatorById);
        System.out.println("Étudiants triés par ID :");
        sm.displayStudents(students, System.out::println);



        System.out.println("Étudiants via Stream :");
        Stream<Student> stream = sm.convertToStream(students);
        stream.forEach(System.out::println);
    }
}
