package demoPrivate;

public class Preson {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+",年龄："+age);
    }

    public int getAge() {//专门用于获取age数据
        return age;
    }

    public void setAge(int age) {//专门用于向age设置数据
        this.age = age;
    }
}
