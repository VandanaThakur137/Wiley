package Assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    int id;
    String name;
    int problemsSolved;
    char grade;

    public Student(int id, String name, int problemsSolved, char grade) {
        this.id = id;
        this.name = name;
        this.problemsSolved = problemsSolved;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student(id=" + id + ", name='" + name + "', problemsSolved=" + problemsSolved + ", grade=" + grade + ")";
    }
}

public class Week3assignment {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 10, 'A'));
        students.add(new Student(2, "Bob", 20, 'B'));
        students.add(new Student(3, "Charlie", 30, 'C'));
        students.add(new Student(4, "Dave", 40, 'D'));
        students.add(new Student(5, "Eve", 50, 'E'));
        students.add(new Student(6, "Frank", 60, 'F'));
        students.add(new Student(7, "Grace", 70, 'G'));
        students.add(new Student(8, "Heidi", 80, 'H'));
        students.add(new Student(9, "Ivan", 90, 'I'));
        students.add(new Student(10, "Jack", 100, 'J'));

        Stream<Student> stream = students.stream();

        

        
        List<Student> sortedS = stream.sorted(Comparator
                .comparing((Student s) -> s.grade)
                .thenComparing((Student s) -> s.problemsSolved))
                .collect(Collectors.toList());

       
        List<Student> top5Students = sortedS.stream().limit(5).collect(Collectors.toList());

      
        top5Students.forEach(System.out::println);
    }
}
