package i.khlebovets;

import java.util.Scanner;

public class TaskC1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 1ое число!!!");
        int a=sc.nextInt();
        System.out.println("Введите 2ое число!!!");
        int b=sc.nextInt();

        int sum=a+b;



        System.out.println("ВЫ ВВЕЛИ  "+a+" и "+b);
        System.out.println("Сумма чисел равна "+sum);

    }
}
