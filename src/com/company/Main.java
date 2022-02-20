package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значения координат первой точки x y z");
        double p1x = Double.parseDouble(br.readLine());
        double p1y = Double.parseDouble(br.readLine());
        double p1z = Double.parseDouble(br.readLine());

        System.out.println("Введите значения координат второй точки x y z");
        double p2x = Double.parseDouble(br.readLine());
        double p2y = Double.parseDouble(br.readLine());
        double p2z = Double.parseDouble(br.readLine());

        System.out.println("Введите значения координат третей точки x y z");
        double p3x = Double.parseDouble(br.readLine());
        double p3y = Double.parseDouble(br.readLine());
        double p3z = Double.parseDouble(br.readLine());

	    Point3D p1 = new Point3D(p1x, p1y, p1z);
        Point3D p2 = new Point3D(p2x, p2y, p2z);
        Point3D p3 = new Point3D(p3x, p3y, p3z);

        if (p1.areTheSame(p2) || p2.areTheSame(p3) || p1.areTheSame(p3))
            System.out.println("одна из точек равна другой");
        else {
            System.out.println("расстояние от точки 1 до точки 2: " + p1.distanceTo(p2));
            System.out.println("расстояние от точки 1 до точки 3: " + p1.distanceTo(p3));
            System.out.println("расстояние от точки 2 до точки 3: " + p2.distanceTo(p3));

            System.out.println("Площадь треугольника: " + Point3D.computeArea(p1, p2, p3));
        }
    }
}
