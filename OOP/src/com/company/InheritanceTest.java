package com.company;

public class InheritanceTest {
    public static void main(String[] args) {
        Circle circle=new Circle(2.3);
        System.out.println(circle.getArea());

        Cylinder cylinder=new Cylinder(circle.radius,33.2);
        System.out.println(cylinder.getVolume());
    }
    public static class Circle{
        private double radius;

        public Circle(double radius) {
            if (radius<0){
                this.radius = 0;
            }else {
                this.radius = radius;
            }
        }
        public double getRadius() {
            return radius;
        }
        public double getArea(){
            return (radius*radius*Math.PI);
        }
    }
    public static class Cylinder extends Circle{
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            if (height<0){
                this.height = 0;
            }else {
                this.height = height;
            }
        }

        public double getHeight() {
            return height;
        }

        public double getVolume(){
            return (getArea()*getHeight());
        }
    }
}
