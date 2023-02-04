import model.Students;
import service.FileService;
import service.StudentsService;

import java.io.IOException;
import java.util.List;

public class Main {

    public static final String URL = "C:\\Users\\79650\\Desktop\\Students.txt";
    public static void main(String[] args) throws IOException {
        List<String> strings = FileService.readFromFile(URL);
        List<Students> students = StudentsService.students(strings);
        Students maxMarkStudent = StudentsService.maxMarkStudent(students);
        StudentsService.namesInAlphabet(students);
        FileService.WriteInTheFile("\n" + maxMarkStudent.toString(), URL);
        FileService.WriteInTheFile("\n" + students, URL);
    }
}