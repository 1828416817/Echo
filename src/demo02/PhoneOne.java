package demo02;

public class PhoneOne {
    public static void main(String[] args){
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        one.brand = "苹果";
        one.color = "红色";
        one.price = 99999.0;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        one.call("宝宝");
        one.sendMessage();
    }
}
