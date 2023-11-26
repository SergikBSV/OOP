package controller;

import data.Student;
import data.Teacher;
import data.User;
import service.DataService;
import service.DataServiceGeneral;
import service.StudentGroupService;
import service.StudentGroupServiceGeneral;
import view.UserView;
import view.UserViewGeneral;

import java.time.LocalDate;
import java.util.List;

//  DIP

public class UserController {

    private final DataServiceGeneral dataService = new DataService();
    private final StudentGroupServiceGeneral studentGroupService = new StudentGroupService();
    private final UserViewGeneral userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<User> userList = dataService.getAll();
//        userView.sendOnConsole(userList);
    }

    public void printStudentGroup() {
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher){
        List<Student> students = dataService.getAllStudents();
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }
    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }
    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}