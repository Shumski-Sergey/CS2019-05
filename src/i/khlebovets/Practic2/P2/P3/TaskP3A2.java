package i.khlebovets.Practic2.P2.P3;

import java.util.Scanner;

public class TaskP3A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1ое число!!!");
        int a = sc.nextInt();
        System.out.println("Введите 2ое число!!!");
        int b = sc.nextInt();
        System.out.println("Введите 3ое число!!!");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(+a + " = " + b + " = " + c);
        } else if (a == b) {
            System.out.println(+a + " = " + b);
        } else if (a == c) {
            System.out.println(+a + " = " + c);
        } else if (b == c) {
            System.out.println(+b + " = " + b);
        } else {
            System.out.println("Числа не равны дург другу");
        }


    }
}
