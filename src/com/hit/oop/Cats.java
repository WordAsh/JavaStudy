package com.hit.oop;

public class Cats extends Animal{

    public Cats (String name,int age,String variety,double height,double weight,String food){
        setName(name);
        setVariety(variety);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setFood(food);
    }

    public Cats(){

    }

    @Override
    public void bark(){
        System.out.println("Miao! Miao! Miao!");
    }
}
