package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String gender;

    private String city;

    private int postalCode;

    private int shoeSize;

    private String hairColor;

    public Person() {
        age = Integer.MAX_VALUE;
        name = "";
        gender = "";
        city = "";
        postalCode = Integer.MAX_VALUE;
        shoeSize = Integer.MAX_VALUE;
        hairColor = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String gender, String city, int postalCode, int shoeSize, String hairColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.postalCode = postalCode;
        this.shoeSize = shoeSize;
        this.hairColor = hairColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public Integer getPostalCode() {
        return postalCode;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

}
