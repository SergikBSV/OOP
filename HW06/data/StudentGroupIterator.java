package data;

import java.util.List;

//  DIP

public class StudentGroupIterator implements UserGroupIterator<Student> {

    private int counter;
    private final List<Student> students;
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }
    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(--counter);
    }
}