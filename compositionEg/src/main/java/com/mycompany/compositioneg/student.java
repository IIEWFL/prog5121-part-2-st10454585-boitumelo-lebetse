package com.mycompany.compositioneg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class student {
    private String name;
    private String surname;
    private int age;
    //change the string to address it within the method also so that its the same data type
    private address address;

    public student() {
    }

    public student(String name, String surname, int age, address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", address=" + address.toString() + '}';
    }
    
    
    
}
