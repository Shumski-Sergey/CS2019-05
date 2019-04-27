package i.khlebovets.Practic2;

import java.util.Scanner;

public class TaskA1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 1ое число!!!");
        int a=sc.nextInt();
        System.out.println("Введите 2ое число!!!");
        int b=sc.nextInt();
        System.out.println("ВЫ ВВЕЛИ  "+a+ " и "+b);
        System.out.println("Сумма чисел =  "+(a+b)+   "\n Разность чисел =  "+(a-b)+ "\n Умножение чисел =  "+(a*b)+"\n Деление чисел =  "+(a/b)+"\n Остаток при делении чисел =  "+(a%b));

    }
}
