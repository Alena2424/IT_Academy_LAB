package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int z = 0; z <= 10; z++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
