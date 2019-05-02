package i.khlebovets.Practic2.P2;

import java.util.Scanner;


public class TaskP2T2{

    public static int sumNums(int num) {
        int sum;
        for(sum = 0; num > 0; num /= 10) {
            sum += num % 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4х-значное число!!!");
        int a = sc.nextInt();
        System.out.println("Сумма  чисел числа " + a + " равна " + sumNums(a));
    }
}
