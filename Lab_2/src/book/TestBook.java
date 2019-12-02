public class TestBook {
    public static void main(String[] args) {
        Book a1 = new Book("Святогор", "svyztogor.vasilivich@gmail.com",'W');
        System.out.println(a1);
        a1.setEmail("svyztogor.vasilivich@gmail.com");
        System.out.println(a1);
    }
}
