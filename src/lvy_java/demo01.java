package lvy_java;

import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("赵云");
        list.add("关羽");
        list.add("张飞");
        list.add("黄忠");
        list.add("马超");
        System.out.println(list);
        //提取元素
        String name = list.get(2);
        System.out.println(name);
        String Whoremove =  list.remove(3);
        System.out.println(Whoremove);
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
