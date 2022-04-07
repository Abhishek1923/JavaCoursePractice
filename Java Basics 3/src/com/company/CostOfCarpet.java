package com.company;

public class CostOfCarpet {
    public static void main(String[] args) {
        Floor f=new Floor(2,3);
        f.getArea();
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
    public class Carpet{
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
    public class Calculator{
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