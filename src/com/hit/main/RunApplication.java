package com.hit.main;

import com.hit.service.StudentService;

import java.util.Scanner;

public class RunApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        System.out.println("=========Welcome to Students Management System===========");
        System.out.println("1.limit for 10 data\n2.update\n3.delete\n4.....\n5.quit");
        functionService();
    }

    public static void functionService(){
        switch (scanner.nextLine()){
            case "1":
                System.out.println(StudentService.selectAll());
                break;
            case "2":
                StudentService.update(scanner.nextInt(),scanner.next(),scanner.nextInt());
                break;
            case "3":
                StudentService.delete(scanner.nextInt());
                break;
            case "4":
                System.out.println("....");
                break;
            case "5":
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
