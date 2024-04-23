package com.hit.oop;

public class HuaMuLan extends HuaHu {
    private String sex;
    public HuaMuLan(){
        this.sex = "Female";
    }
    @Override
    public void fight(){
        System.out.println("I fight for my father.");
    }

    public void makeup(){
        System.out.println("I like dressing.");
    }
}
