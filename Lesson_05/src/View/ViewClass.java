package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClass implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("-----------Список студентов---------");
        for (Student s: students){
            System.out.println(s);
        }
        System.out.println("_______________________________");
    }
    public String prompt(String msg){
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}