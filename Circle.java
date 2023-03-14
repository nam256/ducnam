/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vidu;

/**
 *
 * @author Nam Le
 */
 
    public class Circle extends Shape {
    Double radius = 1.0;
    Double Pi = 3.1415;

    public Circle() {

    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled) {
        this.radius = radius;
        super.color = color;
        super.filled = filled;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Pi * radius * radius;
    }

    public Double getPerimeter() {
        return 2 * Pi * radius;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {

        return "Circle:(" + "radius: " + radius + ", color: " + color + ", filled: " + filled + ", Area: "
                + Pi * radius * radius + ", Perimeter: " + 2 * Pi * radius + ")";
    }

}


