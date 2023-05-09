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
                new Student("Anil",30,'A')
        );

        studentList.stream().filter(s->s.getProblems_solved()>=30)
                .limit(2)
                .forEach(data-> System.out.println(data.getName()+" "+data.getProblems_solved()+" "+data.getGrade()));

    }
}
