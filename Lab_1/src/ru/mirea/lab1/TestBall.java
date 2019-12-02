package ru.mirea.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Black ball", 2);
        Ball d2 = new Ball("White ball", 7);
        Ball d3 = new Ball("Multicolor ball");
        d3.setRadius(1);
        System.out.println(1);
        d1.intoRadius();
        d2.intoRadius();
        d3.intoRadius();
    }
}
