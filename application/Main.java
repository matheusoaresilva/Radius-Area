package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width: ");
                Double W = sc.nextDouble();
                System.out.print("Height: ");
                Double H = sc.nextDouble();
                Rectangle ret = new Rectangle(color, W, H);
                list.add(ret);
            }
            else {
                System.out.print("Radius: ");
                Double R = sc.nextDouble();
                Circle cir = new Circle(color,R);
                list.add(cir);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape:
             list) {
            System.out.println(String.format("%.2f", shape.area()));
        }


        sc.close();
    }
}