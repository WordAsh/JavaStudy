package com.hit.api;

public class Calc {
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1,int num2){
        return num1 - num2;
    }

    public static int mul(int num1,int num2){
        return num1 * num2;
    }

    public static int div(int num1,int num2){
        if(num2 == 0){
            return 0;
        }else{
            return num1 / num2;
        }
    }
}
