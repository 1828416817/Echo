package Strings;

import java.io.Console;

public interface stringbuilder01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Welcome");
        sb.append(" ");
        sb.append("to");
        sb.append(" ");
        sb.append("Java");
        String str = sb.toString();
        System.out.println(str);
        sb.insert(11,"Html and ");
        System.out.println(sb.toString());
        StringBuilder MyStringBuilder = new StringBuilder("Hello World");
        System.out.println(MyStringBuilder);
        StringBuffer sb1 = new StringBuffer();
        sb1.append("abc");
        System.out.println(sb1.toString());
        System.out.println(sb1.reverse());

    }
}
