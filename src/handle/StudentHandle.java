package handle;

import entity.ClassRoom;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent (Scanner scanner){
        System.out.println("Nhập tên sinh viên: ");
        String nameStudent = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập học lực");
        String rank = scanner.nextLine();
        return new Student(nameStudent, age, rank);
    }
    public ArrayList<Student> addStudent(Scanner scanner, ClassRoom classRoom){
        //Add sinh viên
        System.out.println("Nhập thông tin sinh viên muốn thêm");
        StudentHandle studentHandle = new StudentHandle();
        Student studentNew = studentHandle.inputStudent(scanner);
        classRoom.getStudents().add(studentNew);
        System.out.println("Đã thêm sinh viên mới");
        return classRoom.getStudents();
    }

    public ArrayList<Student> updateRankById(Scanner scanner, ClassRoom classRoom){
        //update Rank theo ID
        System.out.println("Nhập ID sinh viên muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        int check = 0;
        for (Student x: classRoom.getStudents()
        ) {
            if (x.getId() == id){
                System.out.println("Nhập học lực muốn cập nhật");
                String rankNew = scanner.nextLine();
                x.setRank(rankNew);
                System.out.println("Update thành công");
                check++;
            }
        }
        if (check == 0) System.out.println("Không tìm thấy ID!!!");
        return classRoom.getStudents();
    }
    public ArrayList<Student> removeStudentByName(Scanner scanner, ClassRoom classRoom){
        //xóa SV theo tên
        System.out.println("Nhập tên sinh viên muốn xóa");
        String nameRemove = scanner.nextLine();
        int check = 0;
        for (Student x: classRoom.getStudents()
        ) {
            if (x.getName().equalsIgnoreCase(nameRemove)){
                classRoom.getStudents().remove(x);
                System.out.println("Remove thành công");
                check++;
            }
        }
        if (check == 0) System.out.println("Không tìm thấy tên SV !!!");
        return classRoom.getStudents();
    }
}
