package demo05;

public class demo01Array {
    public static void main(String[] args) {
        Person[]array = new Person[3];
        Person one = new Person("关羽",25);
        Person two = new Person("刘备",27);
        Person three = new Person("张飞",20);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2].getName());
    }
}
