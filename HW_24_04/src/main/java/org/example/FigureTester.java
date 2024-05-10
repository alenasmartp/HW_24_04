package org.example;

import java.awt.*;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 5, 7),
                new Triangle(2, 4, 6),
        };
        System.out.println("Area: " + calculateArea(figures));
        System.out.println("Perimeter: " + calculatePerimeter(figures));
    }

    public static double calculatePerimeter(Figure[] figs) {
        double perimeter = 0;
        for (int i = 0; i < figs.length; i++) {
            perimeter += figs[i].perimeter();
        }
        return perimeter;
    }

    public static double calculateArea(Figure[] figs) {
        double area = 0;
        for (int i = 0; i < figs.length; i++) {
            area += figs[i].area();
        }
        return area;
    }
}

