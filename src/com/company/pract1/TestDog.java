package com.company.pract1;

public class TestDog {
    public static void main() {

        System.out.println("Class Dog: ");
        Dog dog1 = new Dog("Hellen",3);
        Dog dog2 = new Dog("Bob",8);
        Dog dog3 = new Dog("Arthur");

        dog3.setAge(4);
        System.out.println(dog1);
        dog1.intHumanAge();
        dog2.intHumanAge();
        dog3.intHumanAge();
        System.out.println();
    }

}
