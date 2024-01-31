package com.mycompany.project4;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses= "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("\n1- Freshmen \n2- Sophomore \n3- Junior \n4- Senior \nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentId();
    }

    // Generate an ID
    private void setStudentId(){
        // Grade level + ID
        id++;
        this.studentID = this.gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        // Get inside a loop, user hits 0

        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!(course.equalsIgnoreCase( "Q"))) {
                this.courses += "\n " + course;
                this.tuitionBalance += costOfCourse;
            }else{
                break;
            }
        }while(true);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your Balance is: $"+ this.tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment =scanner.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thank you for payment of $" + payment);
        viewBalance();
    }

    // Show status
    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName
                +"\nGrade Level: " + this.gradeYear
                +"\nStudent ID: " + this.studentID
                +"\nCourses Enrolled: " + this.courses
                +"\nBalance: $" + this.tuitionBalance;
    }
}
