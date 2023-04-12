package entity;

import java.util.ArrayList;

public class TechMaster {
    private String nameManager;
    private String nameTeacher;
    private ClassRoom classRoom;


    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public TechMaster(String nameManager, String nameTeacher, ClassRoom classRoom) {
        this.nameManager = nameManager;
        this.nameTeacher = nameTeacher;
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "nameManager='" + nameManager + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", classRoom=" + classRoom +
                '}';
    }
}
