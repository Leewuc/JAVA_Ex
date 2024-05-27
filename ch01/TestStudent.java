package ch01;
class Student{
    int id;
    String name;
}
public class TestStudent {
    public static void main(String args[]){
        int counter = 10;
        Student std = new Student();
        std.id = 100;
        std.name = "Gildong";
        System.out.println(std.id + " " + std.name);
    }
}
