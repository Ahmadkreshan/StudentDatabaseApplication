package com.mycompany.project4;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for(int i = 0; i<numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        // Print students information
        for(Student student : students){
            System.out.println(student.toString());
        }

    }
}
