package day03methodobjectcreationscanner;

public class Homework03 {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();

        System.out.println("myTeacher.name = " + myTeacher.name);
        System.out.println("myTeacher.age = " + myTeacher.age);

        myTeacher.teach();
    }
}
