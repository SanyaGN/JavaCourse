package main;

import model.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first Name");
        human1.setName(scan.next());
        System.out.println("enter last Name");
        human1.setLastName(scan.next());
        System.out.println("enter year of birth");
        human1.setYearOfBirth(scan.nextInt());
        System.out.println("enter gender with one letter 'f' or 'm'");
        human1.setGender(scan.next());
        System.out.println("is human Armenian? answer 'yes' or 'no'");
        human1.setArmenian(scan.next());
        scan.nextLine();

        System.out.println("enter next user first Name");
        human2.setName(scan.next());
        System.out.println("enter last Name");
        human2.setLastName(scan.next());
        System.out.println("enter year of birth");
        human2.setYearOfBirth(scan.nextInt());
        System.out.println("enter gender with one letter 'f' or 'm'");
        human2.setGender(scan.next());
        System.out.println("is human Armenian? answer 'yes' or 'no'");
        human2.setArmenian(scan.next());
        scan.nextLine();

        System.out.println("enter first Name");
        human3.setName(scan.next());
        System.out.println("enter last Name");
        human3.setLastName(scan.next());
        System.out.println("enter year of birth");
        human3.setYearOfBirth(scan.nextInt());
        System.out.println("enter gender with one letter 'f' or 'm'");
        human3.setGender(scan.next());
        System.out.println("is human Armenian? answer 'yes' or 'no'");
        human3.setArmenian(scan.next());
        System.out.println();

        human1.printInfo();
        System.out.println("---------------------");
        human2.printInfo();
        System.out.println("---------------------");
        human3.printInfo();
    }
}