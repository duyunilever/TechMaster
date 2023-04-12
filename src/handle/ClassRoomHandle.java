package handle;

import entity.ClassRoom;
import entity.Student;
import entity.TechMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoomHandle {
    public ClassRoom inputClassRoom(Scanner scanner){
        System.out.println("Nhập tên môn học: ");
        String subject = scanner.nextLine();

        System.out.println("Nhập số lượng sinh viên");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StudentHandle studentHandle = new StudentHandle();
            Student student = studentHandle.inputStudent(scanner);
            students.add(student);
        }
        return new ClassRoom(subject, students);
    }

}
