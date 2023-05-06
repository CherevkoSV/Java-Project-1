package com.example.java_hw12_Collections2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ShapeSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        String input;

        while (true) {
            System.out.println("Enter the shape to add (Triangle, Circle, IsoscelesTriangle, Quadratian) or 'no' to exit:");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                break;
            }

            Shape shape = null;
            if (input.equals("triangle")) {
                System.out.println("Enter the lengths of the sides of the triangle separated by space (a b c):");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                scanner.nextLine();
                shape = new Triangle(a, b, c);
            } else if (input.equals("circle")) {
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                shape = new Circle(radius);
            } else if (input.equals("isoscelestriangle")) {
                System.out.println("Enter the length of the equal sides and the length of the base separated by space (a c):");
                double a = scanner.nextDouble();
                double c = scanner.nextDouble();
                scanner.nextLine();
                shape = new IsoscelesTriangle(a, c);
            } else if (input.equals("quadratian")) {
                System.out.println("Enter the lengths of the sides of the rectangle separated by space (a b):");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                scanner.nextLine();
                shape = new Quadratian(a, b);
            }

            if (shape != null) {
                shapes.add(shape);
            }
        }

        shapes.sort(Comparator.comparingDouble(Shape::getArea));
        System.out.println("\n============= Figure list sorted by area: ================");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". " + shapes.get(i));
        }

        shapes.sort(Comparator.comparingDouble(Shape::getPerimeter));
        System.out.println("\n============= Figure list sorted by perimeter: ===========");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". " + shapes.get(i));
        }
    }
}

