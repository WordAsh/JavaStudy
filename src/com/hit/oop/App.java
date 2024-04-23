package com.hit.oop;

public class App {
    public static void main(String[] args) {
        Earth earth = Earth.getEarth();
        System.out.println(earth);

        Dogs dog = new Dogs("Jerry", 4, "ZangAo", 34.5, 25.6, "GouLiang");

        dog.bark();
        dog.eat();

        Cats cat = new Cats("Tom", 5, "HuaMao", 23.6, 16.7, "MaoLiang");

        cat.bark();
        cat.eat();

        Student stu = new Student();
        stu.eat();
        stu.run();
        stu.sleep();
        stu.speak();

        Labrador labrador = new Labrador("Tim", 4, "Labrador", 24, 6, "Meat");
        if (labrador.isGuideBlindness()) {
            System.out.println(labrador.getName() + " is form " + labrador.getPort());
        }

        //匿名内部类,接口可以new
        HumanBeing me = new HumanBeing() {
            @Override
            public void sleep() {
                System.out.println("I sleep very well.");
            }

            @Override
            public void eat() {
                System.out.println("I eat a lot.");
            }

            @Override
            public void run() {
                System.out.println("I run everyday.");
            }

            @Override
            public void speak() {
                System.out.println("I don't like speaking in front of people.");
            }
        };

        me.speak();
        me.run();

        //多态
        HuaHu mulan = new HuaMuLan();
        mulan.fight();


        HuaMuLan realMulan = (HuaMuLan) mulan;
        realMulan.makeup();
        realMulan.fight();
    }
}
