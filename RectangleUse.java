package Java;

import java.util.Scanner;

public class RectangleUse {
    public static void main(String[] args){

        Rectangle[] R= new Rectangle[3];

        Scanner input= new Scanner(System.in);

        for(int i=0; i<R.length; i++){
            System.out.print("Enter width of Rectangle " + (i+1) + " : ");
            double w=input.nextDouble();
            System.out.print("Enter height of Rectangle " + (i+1) + " : ");
            double h=input.nextDouble();
            R[i]= new Rectangle(w,h);
        }

        for(int i=0; i<R.length; i++){
            System.out.println("Width of Rectangle " + (i+1) + ": " + R[i].getWidth() );
            System.out.println("Height of Rectangle " + (i+1) + ": " + R[i].getHeight() );
            System.out.println("Area: " + R[i].getArea());
            System.out.println("Perimeter: " + R[i].getPerimeter());
        }



    }
}
