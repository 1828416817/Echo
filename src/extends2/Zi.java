package extends2;

public class Zi extends  Fu{
    int num = 20;
    public void method(){
        int num = 30; //局部变量
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodZi(){
        System.out.println("子类执行");
    }
}