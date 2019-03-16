package com.gupaoedu.designPattern.proxyModel;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void donateMoney(int money) {

        System.out.println(this.name + " has donated " + money + " dollar.");

    }
}
