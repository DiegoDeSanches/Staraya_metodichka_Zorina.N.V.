package ru.mirea.lab1;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Sobaka d1 = new Sobaka("Mike", 2);
        Sobaka d2 = new Sobaka("Helen", 7);
        Sobaka d3 = new Sobaka("Bob");
        d3.setAge(1);
        System.out.println(1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}


