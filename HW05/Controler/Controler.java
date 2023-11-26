package Controler;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.StudyGroupView;
import java.util.ArrayList;
import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public StudyGroup createStudyGroupWithIds(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> students = new ArrayList<>();
        for (int studentId : studentIds) {
            students.add((Student) service.getUserById(Type.STUDENT, studentId));
        }
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void printStudyGroupInfo(StudyGroup studyGroup) {
        studyGroupView.printOnConsoleStudyGroup(studyGroup);
    }
}
