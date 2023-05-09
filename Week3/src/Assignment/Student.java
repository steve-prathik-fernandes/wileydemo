package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student
{
    String name;
    int problems_solved;
    char grade;
    public Student(String name,int problems_solved,char grade){

        this.name=name;
        this.problems_solved=problems_solved;
        this.grade=grade;
    }

    public String getName() {
        return this.name;
    }

    public char getGrade() {
        return this.grade;
    }

    public int getProblems_solved() {
        return this.problems_solved;
    }

    public static void main(String[] args) {
        List<Student>studentList=Arrays.asList(
          new Student("Steve",25,'A'),
                new Student("Anil",40,'A'),
                new Student("Janavi",50,'C'),
                new Student("Dhanush",60,'A')
        );

        studentList.stream().filter(s->s.getProblems_solved()>=20)
                .forEach(stu-> {
                    System.out.println(stu.getName() + " " + stu.getProblems_solved() + " " + stu.getGrade());
                });

    }
}
