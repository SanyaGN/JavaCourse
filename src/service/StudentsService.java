package service;

import model.Students;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentsService {
    Students student1 = new Students();
    Students student2 = new Students();
    Students student3 = new Students();
    Students student4 = new Students();
    Students student5 = new Students();
    Students student6 = new Students();
    Students student7 = new Students();
    Students student8 = new Students();
    Students student9 = new Students();
    Students student10 = new Students();

    Students[] arrayOfStudents = {student1, student2, student3, student4, student5,
            student6, student7, student8, student9, student10};

    public static String[] getDataFromTextFile() throws Exception{
        Path path = Paths.get("C:\\Users\\79650\\Desktop\\Students.txt");
        return Files.readAllLines(path).toArray(new String[0]);
    }

    public void setValuesToStudents(String[] array) {
        for (int i = 0; i < arrayOfStudents.length; i++) {
            String[] s = array[i].split(",");
            arrayOfStudents[i].setName(s[0]);
            arrayOfStudents[i].setAge(Integer.parseInt(s[1]));
        }
        System.out.println(arrayOfStudents[8].getName());
        System.out.println(arrayOfStudents[8].getAge());
    }
}
