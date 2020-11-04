package lvy_java;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello java");
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        int []numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int num:numbers){
            System.out.print(num);
            System.out.print(',');
        }
        System.out.println('\n');
        System.out.println(Math.max(12, 100));
        String string1 = "I love";
        String string2 = "you";
        System.out.println(string1.concat(string2));
        int []array = new int[10];
        for(int arr:array){
            System.out.println(arr);
        }
        Date date = new Date();
        System.out.println(date.toString());
    }

}
