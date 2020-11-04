package demo04;

import javax.xml.namespace.QName;

public class dem0Sytudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("关羽");
        stu1.setAge(21);
        System.out.println("姓名:"+stu1.getName()+",年龄:"+stu1.getAge());
        System.out.println("===================");
        Student stu2 = new Student("关羽",21);
        stu2.setAge(25);
        System.out.println("姓名:"+stu1.getName()+",年龄:"+stu1.getAge());


    }
}
