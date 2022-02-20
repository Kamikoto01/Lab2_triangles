package com.company;

import static java.lang.Math.*;
// https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(0, 0, 0);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean areTheSame(Point3D p) {
        return p.getX() == this.getX() && p.getY() == this.getY() && p.getZ() == this.getZ();
    }

    public double distanceTo(Point3D p) {
        return (double)round(100 * sqrt(pow(p.getX() - this.getX(), 2)
                + pow(p.getY() - this.getY(), 2)
                + pow(p.getZ() - this.getZ(), 2)))/100;

        // формула для нахождения расстояния между двумя точками (x2-x1)^{2}+(y2-y1)^{2}
        // Math.sqrt(число) - возвращает число(double) равное квадратному кореню из аргумента функции
        // Math.pow(число, степень) - возвращает число(double) возведённое в степень
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
    }

    public static double computeArea(Point3D p1, Point3D p2, Point3D p3) {

        double p1p2 = p1.distanceTo(p2);
        double p1p3 = p1.distanceTo(p3);
        double p2p3 = p2.distanceTo(p3);

        double per = ((p1p2 + p1p3 + p2p3))/2.0; // формула полупериметра для формулы герона
        return sqrt(per*(per - p1p2)*(per - p1p3)*(per - p2p3)); //  sqrt{p(p-a)(p-b)(p-c)} - та самая формула герона
    }
}
