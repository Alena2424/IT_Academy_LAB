package lesson3;

public class Task3 {
    public static void main(String[] args) {
        int time = 5;
        if (time >= 21) {
            System.out.println("Good night");
        } else if (time >= 16) {
            System.out.println("Good evening");
        } else if (time >= 12) {
            System.out.println("Good day");
        } else if (time >= 6) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good night");
        }
    }
}
