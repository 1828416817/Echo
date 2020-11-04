package extens;

public class demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
        teacher.age=18;
        System.out.println(teacher.age);
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
