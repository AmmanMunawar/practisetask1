package com.ebricks.task1;

class Circle extends Shape{
    private int x;
    private int y;
    private int radius;
    public Circle(int x,int y ,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        System.out.println("Circle Points for X = " +  this.x + "  Circle Points for Y = "
                + this.y +"  Circle Points for Radius = " + this.radius);
    }
}