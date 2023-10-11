import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров StudentController и TeacherController
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        // Создание нескольких студентов
        studentController.create("Иван", "Иванов", "Иванович", LocalDate.of(2000, 1, 1));
        studentController.create("Петр", "Петров", "Петрович", LocalDate.of(2001, 2, 2));

        // Создание нескольких учителей
        teacherController.create("Анна", "Аннова", "Анновна", LocalDate.of(1990, 3, 3));
        teacherController.create("Мария", "Мариева", "Мариевна", LocalDate.of(1985, 4, 4));

        // Отображение списка учителей
        System.out.println("Список учителей:");
        teacherController.displayAllTeachers();

        // Редактирование деталей учителя
        teacherController.edit(1L, "Анна", "Измененная", "Анновна", LocalDate.of(1990, 3, 3));

        // Отображение списка учителей после редактирования
        System.out.println("\nСписок учителей после редактирования:");
        teacherController.displayAllTeachers();
    }
}