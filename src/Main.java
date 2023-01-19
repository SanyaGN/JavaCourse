import service.StudentsService;

public class Main {
    public static void main(String[] args) throws Exception {

        StudentsService studentsService = new StudentsService();
        studentsService.setValuesToStudents(StudentsService.getDataFromTextFile());
    }
}