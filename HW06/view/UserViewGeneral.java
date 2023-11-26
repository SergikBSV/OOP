package view;

import data.Student;
import data.StudentGroup;
import data.User;

import java.util.List;
import java.util.logging.Logger;

// применяем DIP
public interface UserViewGeneral {


    public void sendOnConsole(List<User> userList);

    public void sendOnConsoleUserGroup(StudentGroup studentGroup);

    public void sendOnConsoleListStudent(List<Student> students);


}
