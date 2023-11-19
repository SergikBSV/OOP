package View;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

public class StudyGroupView {
    public void printOnConsoleStudyGroup(StudyGroup studyGroup) {
        Teacher teacher = studyGroup.getTeacher();
        System.out.println("Teacher: ");
        System.out.println(teacher);

        System.out.println("Students: ");
        for (Student student : studyGroup.getStudentList()) {
            System.out.println(student);
        }
    }
}
