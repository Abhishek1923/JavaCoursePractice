package com.company;

public class ConstructorTest {
    public static void main(String[] args) {
        Floor f=new Floor(2,3);
        System.out.println(f.getArea());

        Carpet c=new Carpet(250);
        System.out.println(c.getCost());

        Calculator calculator=new Calculator(f,c);
        System.out.println(calculator.getTotalCost());

    }
    public static class Floor{
        private double width,length;

        public Floor(double width, double length) {
            if(width<0||length<0){
                this.width = 0;
                this.length = 0;
            }else{
                this.width = width;
                this.length = length;
            }
        }
        public double getArea(){
            return (this.length*this.width);
        }
    }
    public static class Carpet{
        private double cost;

        public Carpet(double cost) {
            if(cost<0){
                this.cost = 0;
            }else {
                this.cost = cost;
            }
        }
        public double getCost(){
            return cost;
        }

    }
    public static class Calculator{
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea()* carpet.getCost();
        }
    }
}