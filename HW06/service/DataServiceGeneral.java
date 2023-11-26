package service;

import data.Student;
import data.User;

import java.time.LocalDate;
import java.util.List;

//  DIP

public interface DataServiceGeneral {
    List<User> getAll();
    List<Student> getAllStudents();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
