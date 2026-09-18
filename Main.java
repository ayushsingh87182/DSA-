public class Main {
    public static void main(String[] args) {
        String name = "Ayush";
        String greeting = "Hello";

        String message = greeting + ", " + name + "!";

        System.out.println(message);
        System.out.println("String length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
    }
}