package com.hit.oop;

public class Dogs extends Animal{
    public Dogs(String name,int age,String variety,double height,double weight,String food){
        setName(name);
        setVariety(variety);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setFood(food);
    }

    public Dogs(){

    }

    @Override
    public void bark(){
        System.out.println("Wang! Wang! Wang!");
    }
}
