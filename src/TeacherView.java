import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger2 = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger2.info(teacher.toString());
        }
    }

}
