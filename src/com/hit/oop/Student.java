package com.hit.oop;

public class Student implements HumanBeing {
    public Student(){

    }
    @Override
    public void speak(){
        System.out.println("Students speak English.");
    }

    @Override
    public void eat(){
        System.out.println("Students eat meat.");
    }

    @Override
    public void sleep(){
        System.out.println("Students sleep late.");
    }

    @Override
    public void run(){
        System.out.println("Students run everyday.");
    }
}
