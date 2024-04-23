package com.hit.oop;

public abstract class Animal {
    private static final String PORT = "MingMen";
    private String name;
    private int age;
    private String variety;
    private double height;
    private double weight;
    private String food;
    public void setFood(String food){
        this.food = food;
    }
    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setVariety(String variety){
        this.variety = variety;
    }

    public String getVariety(){
        return this.variety;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight =weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public abstract void bark();

    public void eat(){
        System.out.println(this.name + " eats " + this.food);
    }

    public String getPort(){
        return PORT;
    }
}
