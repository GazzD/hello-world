package com.ironhack.helloworld.classes;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private final long ID;

    public Dog(String name, int age, String breed, long ID) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ID = ID;
    }

    public Dog(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public long getId() {
        return ID;
    }
}
