public class Lesson2_5 {
    public static void main(String ...args) {
        double number = 6.66;
        int IntegerNamber = (int) number;
        boolean answer = number % IntegerNamber != 0;
        System.out.println("Это правда, что число имеет вещественную часть? " + answer);
    }
}