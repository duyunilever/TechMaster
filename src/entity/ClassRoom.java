package entity;

import java.util.ArrayList;

public class ClassRoom {
    private String subject;
    private ArrayList<Student> students;

    public ClassRoom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "subject='" + subject + '\n' +
                ", students=" + students +
                '}';
    }
}
