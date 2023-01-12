package service;

import model.Cat;

import java.util.Scanner;

public class CatService {
    Scanner scanner = new Scanner(System.in);
    Cat cat;
    String name = scanner.next();
    int age = scanner.nextInt();
    char gender = scanner.next().charAt(0);
    boolean isVaccinated = scanner.nextBoolean();
    int weight = scanner.nextInt();

    Cat firstCat = new Cat(name, age, gender, isVaccinated, weight);
    Cat secondCat = new Cat(name, age, gender, isVaccinated, weight);
    Cat thirdCat = new Cat(name, age, gender, isVaccinated, weight);

    Cat[] arrayOfCats = {firstCat, secondCat, thirdCat};

    public Cat catWithMaxAge() {
        if (firstCat.getAge() > secondCat.getAge() && secondCat.getAge() >= thirdCat.getAge()) {
            cat = firstCat;
        } else if (secondCat.getAge() > firstCat.getAge() && firstCat.getAge() >= thirdCat.getAge()) {
            cat = secondCat;
        } else {
            cat = thirdCat;
        }
        return cat;
    }

    public Cat catWithMinAge() {
        if (firstCat.getAge() < secondCat.getAge() && secondCat.getAge() <= thirdCat.getAge()) {
            cat = firstCat;
        } else if (secondCat.getAge() < firstCat.getAge() && firstCat.getAge() <= thirdCat.getAge()) {
            cat = secondCat;
        } else {
            cat = thirdCat;
        }
        return cat;
    }

    public Cat catWithMaxWeight() {
        if (firstCat.getWeight() > secondCat.getWeight() && secondCat.getWeight() >= thirdCat.getWeight()) {
            cat = firstCat;
        } else if (secondCat.getWeight() > firstCat.getWeight() && firstCat.getWeight() >= thirdCat.getWeight()) {
            cat = secondCat;
        } else {
            cat = thirdCat;
        }
        return cat;
    }

    public Cat catWithMinWeight() {
        if (firstCat.getWeight() < secondCat.getWeight() && secondCat.getWeight() <= thirdCat.getWeight()) {
            cat = firstCat;
        } else if (secondCat.getWeight() < firstCat.getWeight() && firstCat.getWeight() <= thirdCat.getWeight()) {
            cat = secondCat;
        } else {
            cat = thirdCat;
        }
        return cat;
    }

    public Cat petWithMinAge() {
        int catAge = 0;
        for (int i = 0; i < arrayOfCats.length; i++) {
            if (arrayOfCats[i].isPet() && catAge >= arrayOfCats[i].getAge()) {
                catAge = arrayOfCats[i].getAge();
                cat = arrayOfCats[i];
            }
            else {
                //here should be exception
                System.out.println("there are no pets");
            }
        }
        return cat;
    }
}
