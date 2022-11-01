package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "Leon";
    private int age = 5;

    public Person() {

    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
        System.out.println(name);
    }

    public void setAge(int age) {
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
