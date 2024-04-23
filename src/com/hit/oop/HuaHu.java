package com.hit.oop;

public class HuaHu implements HumanBeing {
    private String sex;
    public String getSex(){
        return sex;
    }
    public HuaHu(){
        this.sex = "Male";
    }
    @Override
    public void speak(){
        System.out.println("I am " + getSex());
    }
    @Override
    public void run(){

    }
    @Override
    public void eat(){

    }
    @Override
    public void sleep(){

    }
    public void fight(){
        System.out.println("I fight for my country.");
    }

}
