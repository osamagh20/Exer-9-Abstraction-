public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("java",23,"ahmed");
        System.out.println("the base price = "+b1.getPrice());
        System.out.println("the  new price after discount = "+b1.getDiscount());

        Movie m1 = new Movie("crime",120,"mikle");
        System.out.println("the base price = "+m1.getPrice());
        System.out.println("the  new price after discount = "+m1.getDiscount());



    }
}