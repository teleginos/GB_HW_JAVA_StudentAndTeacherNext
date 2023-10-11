import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public void editTeacher(Long teacherId, String newFirstName, String newSecondName, String newPatronymic, LocalDate newDateOfBirth) {
        Optional<Teacher> teacherToEdit = teachers.stream().filter(teacher -> teacher.getTeacherId().equals(teacherId)).findFirst();
        teacherToEdit.ifPresent(teacher -> {
            teacher.setFirstName(newFirstName);
            teacher.setSecondName(newSecondName);
            teacher.setPatronymic(newPatronymic);
            teacher.setDateOfBirth(newDateOfBirth);
        });
    }
}
