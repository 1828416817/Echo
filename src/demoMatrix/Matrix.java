package demoMatrix;

import java.util.Scanner;

public class Matrix {
   private int rows;
   private int cols;
   private double[]data;
   public Matrix(){
       this.rows = this.cols = 3;
       data = new double[this.rows*this.cols];
   }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[this.rows*this.cols];
    }

    public void setData(){
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Please input the element");
            for (int i = 0; i <this.rows; i++) {
                for (int j = 0; j <this.cols ; j++) {
                    this.data[i*this.cols+j] = obj.nextDouble();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            obj.close();
        }
    }
    public  void getData(){
        System.out.println("The element");
        for (int i = 0; i <this.rows; i++) {
            for (int j = 0; j <this.cols ; j++) {
                System.out.println(this.data[i*this.cols+j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
