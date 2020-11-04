package oop;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double Long;
    private double width;

    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入长方形的长和宽");
            this.Long = scanner.nextDouble();
            this.width = scanner.nextDouble();
        }catch (Exception e){
            this.Long = 1.0;
            this.width = 1.0;
        }
    }

    @Override
    public double area() {
        return this.Long*this.width;
    }
}
