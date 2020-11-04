package demo02;

public class demoString {
    public static void main(String[] args) {
        String s = "dhjsgfdhjdsgfhjdgfhjgdshjfghjdshgfjhdfhjgdfhjfghhjdfhgdhjghjdh";
        int len = s.length();
        System.out.println(len);
        String str1 = "Hello";
        String str2 = "World";
        String str3 = null;
        try {
            str3 = str1.concat(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(str3);
        char ch = str1.charAt(3);
        System.out.println(ch);
        String str4 = "ababababab";
        int c = str4.indexOf("ab");
        System.out.println(c);
        String str5 = "HelloWorld";
        String str = str5.substring(2);
        System.out.println(str);
        

    }

}
