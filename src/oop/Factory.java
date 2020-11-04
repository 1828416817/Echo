package oop;

import java.util.Scanner;

public class Factory {
    private final int n = 5;
    Shape[] shapes;

    public Factory() {
      shapes = new Shape[n];
    }
    public void operate(){
        double totalArea = 0.0;
        Scanner scanner = new Scanner(System.in);
        int sel;
        double areas;
        for (int i = 0; i <n; i++) {
            System.out.println("********Option*****");
            System.out.println("1--------Rectangle");
            System.out.println("2--------Circle");
            System.out.println("*******************");
            do {
                try {
                    sel = scanner.nextInt();
                }catch (Exception e){
                    sel = -1;
                }
            }while (sel<1||sel>2);
            switch (sel){
                case 1:
                    shapes[i] = new Rectangle();
                    break;
                case 2:
                    shapes[i] = new Circle();
                    break;
            }
            areas = shapes[i].area();
            totalArea+=areas;
        }
        System.out.println("Total area of"+n+"shape is"+totalArea);
    }
}
