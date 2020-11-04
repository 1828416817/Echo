package extends1;

public class demo01Extends1 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("=============");
        System.out.println(zi.num);
        //这个方法是子类的。优先用子类
        zi.methodZi();
        zi.methodFu();
    }

}
