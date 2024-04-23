package com.hit.oop;

public final class Labrador extends Dogs {
    public Labrador(String name,int age,String variety,double height,double weight,String food){
        super(name, age, variety, height, weight, food);
    }

    public Labrador(){

    }

    public final boolean isGuideBlindness(){
        return true;
    }
}
