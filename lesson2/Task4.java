package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int n = 789;
        int x = n / 100;
        int y = n % 100;
        int z = y / 10;
        int w = y % 10;
        int q = x + z + w;
        System.out.println("Сумма чисел = " + q);
    }
}
