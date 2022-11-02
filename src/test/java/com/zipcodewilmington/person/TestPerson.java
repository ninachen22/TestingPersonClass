package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedGender = "";
        String expectedCity = "";
        Integer expectedPostalCode = Integer.MAX_VALUE;
        Integer expectedShoeSize = Integer.MAX_VALUE;
        String expectedHairColor = "";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualGender = person.getGender();
        String actualCity = person.getCity();
        Integer actualPostalCode = person.getPostalCode();
        Integer actualShoeSize = person.getShoeSize();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedCity, actualCity);
        Assert.assertEquals(expectedPostalCode, actualPostalCode);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testConstructorWithNameAgeGenderCityPostalShoeHair() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedGender = "Male";
        String expectedCity = "Wilmington";
        Integer expectedPostalCode = 19801;
        Integer expectedShoeSize = 9;
        String expectedHairColor = "black";

        // When
        Person person = new Person(expectedName, expectedAge, expectedGender, expectedCity, expectedPostalCode, expectedShoeSize, expectedHairColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualGender = person.getGender();
        String actualCity = person.getCity();
        Integer actualPostalCode = person.getPostalCode();
        Integer actualShoeSize = person.getShoeSize();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedCity, actualCity);
        Assert.assertEquals(expectedPostalCode, actualPostalCode);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetGender() {
        // Given
        Person person = new Person();
        String expected = "female";

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetCity() {
        // Given
        Person person = new Person();
        String expected = "Wilmington";

        //When
        person.setCity(expected);

        //Then
        String actual = person.getCity();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetPostalCode() {
        // Given
        Person person = new Person();
        Integer expected = 19801;

        //When
        person.setPostalCode(expected);

        //Then
        Integer actual = person.getPostalCode();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetShoeSize() {
        // Given
        Person person = new Person();
        Integer expected = 9;

        //When
        person.setShoeSize(expected);

        //Then
        Integer actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetHairColor() {
        // Given
        Person person = new Person();
        String expected = "black";

        //When
        person.setHairColor(expected);

        //Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
}
