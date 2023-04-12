package entity;

public class Student {
    public static int autoId;
    private int id;
    private String name;
    private int age;
    private String rank;

    public Student(String name, int age, String rank) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public static int getAutoId() {
        return autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}' + '\n';
    }
}
