package Strings;

public class demo01 {
    public static void main(String[] args) {
        String str1 = "I Love you";
        char[]charArray = str1.toCharArray();
        System.out.println(charArray.length);
        for (int i = 0; i < 10; i++) {
            System.out.println(charArray[i]);
        }
        byte[]bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str2 = "I love you";
        String str3 = "I hate you";
        String str4 = str2.replace("o","p");
        System.out.println(str4);
        System.out.println(str2);
        String lang = "你有病啊";
        String lang1 = lang.replace("病","饼");
        System.out.println(lang1);
        
        String str = "a,b,c,d,e,f,g";
        String[]array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
