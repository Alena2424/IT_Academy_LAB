package lesson2;

public class task5 {
    public static void main(String[] args) {
        double number = 6.66;
        int IntegerNamber = (int) number;
        boolean answer = number % IntegerNamber != 0;
        System.out.println("Это правда, число имеет вещественную часть? " + answer);
    }
}
