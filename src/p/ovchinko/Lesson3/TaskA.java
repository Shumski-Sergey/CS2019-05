package p.ovchinko.Lesson3;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 2 целых числа : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Результаты(сумма/разница/умножение/деление) : "+(a+b)+" "+(a-b)+" "+(a*b)+" "+(a%b));
        System.out.println("Результаты : "+(double)(a+b)+" "+(double)(a-b)+" "+(double)(a*b)+" "+(double)(a%b));
    }
}
