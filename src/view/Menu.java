package view;

import java.util.Scanner;

public class Menu {
    public int selectTask(Scanner scanner){
        System.out.println("Mời bạn chọn thao tác \n" +
                "1: In lại thông tin TechMaster\n" +
                "2: Add sinh viên mới\n" +
                "3: Update học lực theo ID\n" +
                "4: Remove sinh viên theo name");
        int n = Integer.parseInt(scanner.nextLine());
        return n;
    }
}
