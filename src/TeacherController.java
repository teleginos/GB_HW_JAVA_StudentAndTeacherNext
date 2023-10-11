import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService dataService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void edit(Long teacherId, String newFirstName, String newSecondName, String newPatronymic, LocalDate newDateOfBirth) {
        dataService.editTeacher(teacherId, newFirstName, newSecondName, newPatronymic, newDateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = dataService.getAll();

        teacherView.sendOnConsole(teachers);

    }
}
