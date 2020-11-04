package oop;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;
    private final double PI = Math.acos(-1.0);
    public Circle(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入圆的半径");
            this.radius = scanner.nextDouble();

        }catch (Exception e){
            this.radius = 1;
        }
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
