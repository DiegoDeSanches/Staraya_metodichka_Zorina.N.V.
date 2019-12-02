package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Black book", 2);
        Book d2 = new Book("White book", 7);
        Book d3 = new Book("Multicolor");
        d3.setPages(1);
        System.out.println(1);
        d1.intoPages();
        d2.intoPages();
        d3.intoPages();
    }
}
