package com.student.main;

import java.util.Scanner;
import com.student.dto.StudentDTO;
import com.student.service.StudentService;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Course:");
        String course = sc.nextLine();

        StudentDTO student = new StudentDTO(id, name, marks, course);

        StudentService service = new StudentService();

        if (service.registerStudent(student)) {
            System.out.println("Student Added Successfully");
        } else {
            System.out.println("Failed");
        }
    }
}
