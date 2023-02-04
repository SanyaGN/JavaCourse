package service;

import comparator.NameComparator;
import model.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentsService {

    public static Students maxMarkStudent(List<Students> students) {
        return Collections.max(students);
    }

    public static List<Students> students(List<String> dataFromFile) {
        List<Students> students = new ArrayList<>();
        for (int i = 0; i < dataFromFile.size(); i++) {
            students.add(i, new Students(dataFromFile.get(i)));
        }
        return students;
    }

    public static void namesInAlphabet(List<Students> students) {
        Collections.sort(students, new NameComparator());
    }
}
