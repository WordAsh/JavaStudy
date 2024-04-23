package com.hit.api;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("以next方式接收：");
        if (scanner.hasNext()) {
            String str1 = scanner.next();
            System.out.println(str1);
        }


        if (scanner.hasNextLine()) {
            String str2 = scanner.nextLine();
            System.out.println(str2);
        }

        System.out.println("以nextInt方式接收：");
        int i;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("i = " + i);
        }

        System.out.println("输入一系列数字，计算其总和和平均值:");
        double sum = 0;
        int cnt = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            cnt += 1;
        }
        System.out.println("sum = " + sum);
        System.out.println("cnt = " + cnt);
        System.out.println("avg = " + sum / cnt);
    }
}
