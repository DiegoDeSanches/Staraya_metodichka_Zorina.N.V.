package ru.mirea.lab1; //Собака, мяч и книга
import java.lang.*;

public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;
    }
    public Ball(){
        color = "Pup";
        radius = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String nacolorme){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoRadius(){
        System.out.println(color+" radius of this ball is "+radius*7+" meters");
    }
}
