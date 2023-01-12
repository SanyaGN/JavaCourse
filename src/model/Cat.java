package model;

public class Cat {
    private String name;
    private int age;
    private char gender;
    private boolean isPet;
    private int weight;

    public Cat(String name, int age, char gender, boolean isPet, int weight) {
        System.out.println("print name");
        this.name = name;
        System.out.println("print age");
        this.age = age;
        this.gender = gender;
        this.isPet = isPet;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isPet() {
        return isPet;
    }

    public int getWeight() {
        return weight;
    }
}
