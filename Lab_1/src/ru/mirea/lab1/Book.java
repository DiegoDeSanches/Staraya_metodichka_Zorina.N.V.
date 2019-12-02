package ru.mirea.lab1;
import java.lang.*;

public class Book {
    private String name;
    private int pages;

    public Book(String n, String m, int a){
        name = n;

        pages = a;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book(){
        name = "Pup";
        pages = 0;
    }

    public Book(String black_ball, int i) {
    }

    public void setAge(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return pages;
    }
    public String toString(){
        return this.name+", quontity "+this.pages;
    }
    public void intoHumanAge(){
        System.out.println(name+" quontity of pages in this book "+pages*7+" pages");
    }

    public void intoPages() {
    }

    public void setPages(int i) {
    }
}
