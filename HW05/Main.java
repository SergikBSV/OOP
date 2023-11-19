import Controler.Controler;
import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        controler.createTeacher("Иван", "Иванович", "Иванов", "01.02.1990");
        controler.createStudent("Петр", "Петрович", "Петров", "03.04.1991");
        controler.createStudent("Семен", "Семенович", "Семенов", "05.06.1992");
        controler.createStudent("Мария", "Ивановна", "Иванова", "07.08.1993");

        int teacherId = 1;
        List<Integer> studentIds =  List.of(1, 2, 3);

        StudyGroup studyGroup = controler.createStudyGroupWithIds(teacherId, studentIds);
        controler.printStudyGroupInfo(studyGroup);
    }
}
