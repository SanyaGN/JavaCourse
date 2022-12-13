package model;

public class Human {
    private String name;
    private String lastName;
    private int yearOfBirth;
    private char gender;
    private boolean isArmenian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 1904 && yearOfBirth < 2022) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String answer) {
        switch (answer) {
            case "f":
                gender = 'f';
                break;
            case "m":
                gender = 'm';
        }
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(String armenian) {
        switch (armenian) {
            case "yes":
                isArmenian = true;
                break;
            case "no":
                isArmenian = false;
        }
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(yearOfBirth);
        System.out.println(gender);
        System.out.println(isArmenian);
    }
}
