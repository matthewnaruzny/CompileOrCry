package ca.ualberta.compileorcry;

public class Circle extends Shape{
    private double radius;

    public Circle(int x, int y, String color, double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
