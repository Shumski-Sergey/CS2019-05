package mkavalevich.lesson03;

public class TaskC2 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        int currentDigit;
        currentDigit = number % 10;
        sum = sum + currentDigit;
        number = number / 10;
        currentDigit = number % 10;
        sum = sum + currentDigit;
        number = number / 10;
        currentDigit = number % 10;
        sum = sum + currentDigit;
        number = number / 10;
        sum = sum + number;
        return sum;
    }
}
