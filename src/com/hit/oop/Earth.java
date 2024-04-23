package com.hit.oop;

public class Earth {
    private static Earth earth = new Earth();
    public static Earth getEarth(){
        return earth;
    }
    private Earth(){

    }


}
