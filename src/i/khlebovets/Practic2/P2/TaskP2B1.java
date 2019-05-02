package i.khlebovets.Practic2.P2;

import java.util.Scanner;

public class TaskP2B1 {


    public static double dis(int a, int b, int c) {
        double k = (double)a;
        System.out.println("ВЫ ВВЕЛИ  " + a);
        double l = (double)b;
        System.out.println("ВЫ ВВЕЛИ  " + b);
        double m = (double)c;
        System.out.println("ВЫ ВВЕЛИ  " + c);
        double d = l * l - 4.0D * k * m;
        System.out.println("Дискриминант равен\t" + d);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1ое число!!!");
        int a = sc.nextInt();
        System.out.println("Введите 2ое число!!!");
        int b = sc.nextInt();
        System.out.println("Введите 3ое число!!!");
        int c = sc.nextInt();
        double d = dis(a, b, c);
        double x;
        if (d > 0.0D) {
            x = ((double)(-b) + Math.sqrt(d)) / (double)(2 * a);
            double x2 = ((double)(-b) - Math.sqrt(d)) / (double)(2 * a);
            System.out.println("Первый корень: " + x + " Второй корень: " + x2);
        } else if (d == 0.0D) {
            x = (double)(-b / (2 * a));
            System.out.println("Дискриминант имеет один корень: " + x);
        } else {
            System.out.println("Отрицательный Дискриминант");
        }

    }
}
