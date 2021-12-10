package edu.northeastern.fxmy;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Date start = new Date();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strStart =sdf.format(start);
        String strEnd =sdf.format(end);
        System.out.println();

        Student student1 = new Student("Student1", 23 ,start);
        Student student2 = new Student("Student2", 25, end);
        Student student3 = new Student("Student3", 34,start);
        Student student4 = new Student("Student4", 18,start);
        Student student5 = new Student("Student5", 22,end);
        Student student6 = new Student("Student6", 23,start);
        Student student7 = new Student("Student7", 32,end);
        Student student8 = new Student("Student8", 30,start);
        Student student9 = new Student("Student9", 19,end);
        Student student10 = new Student("Student10", 21,start);


        Student[] arr = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(arr));

        NameComparator(students);
        System.out.println();
        GpaComparator(students);
        System.out.println();
        DateOfBirthComparator(students);
    }


    public static void NameComparator(ArrayList<Student> students){
        students.stream()
                .sorted( ( st1, st2) ->  st1.getName().compareTo(st2.getName()) ).
                forEach(student -> System.out.println(student.getName() + " " + student.getGpa() + " " + student.getDateOfBirth()));
    }

    public static void GpaComparator(ArrayList<Student> students){
        students.stream()
                .sorted( ( st1, st2) -> (int) (st2.getGpa() - (st1.getGpa()))).
                forEach(student -> System.out.println(student.getName() + " " + student.getGpa() + " " + student.getDateOfBirth()));
    }

    public static void DateOfBirthComparator(ArrayList<Student> students){
            students.stream()
                .sorted( ( st1, st2) ->  st1.getDateOfBirth().compareTo(st2.getDateOfBirth()) ).
                forEach(student -> System.out.println(student.getName() + " " + student.getGpa() + " " + student.getDateOfBirth()));
        }
    }
