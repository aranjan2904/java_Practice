package com.practice.encapsulation;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a > 0)
            age = a;
        else
            System.out.println("Invalid age");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Navin");

        System.out.println(obj.getName() + " is " + obj.getAge() + " years old");
    }
}
