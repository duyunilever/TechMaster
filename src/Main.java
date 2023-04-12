import entity.ClassRoom;
import entity.Student;
import entity.TechMaster;
import handle.ClassRoomHandle;
import handle.StudentHandle;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên quản lý: ");
        String nameManager = scanner.nextLine();
        System.out.println("Nhập tên giáo viên: ");
        String nameTeacher = scanner.nextLine();
        ClassRoomHandle classRoomHandle = new ClassRoomHandle();
        ClassRoom classRoom = classRoomHandle.inputClassRoom(scanner);
        TechMaster techMaster = new TechMaster(nameManager, nameTeacher, classRoom);
        System.out.println("Thông tin chi tiết của trung tâm\n" + techMaster);
        String choose;
        do {
            Menu menu = new Menu();
            int n = menu.selectTask(scanner);
            StudentHandle studentHandle = new StudentHandle();
            if (n == 1){
                System.out.println("Thông tin chi tiết của trung tâm\n" + techMaster);
            }
            else if (n == 2){
                studentHandle.addStudent(scanner, classRoom);
            } else if (n == 3) {
                studentHandle.updateRankById(scanner, classRoom);
            } else if (n == 4) {
                studentHandle.removeStudentByName(scanner, classRoom);
            }
            System.out.println("Bạn muốn thao tác tiếp không (Y/N)");
            choose = scanner.nextLine();
        } while (choose.equalsIgnoreCase("y"));

    }
}