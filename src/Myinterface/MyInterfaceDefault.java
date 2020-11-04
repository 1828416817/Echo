package Myinterface;

public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //新添加一个抽象方法
    //public abstract void methodAbs2();
    //新添加的方法改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }

}
