package i.khlebovets;

import java.util.Scanner;

public class TaskC2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 1ое число!!!");
        int a=sc.nextInt();
        System.out.println("Введите 2ое число!!!");
        int b=sc.nextInt();
        int c=a+b;



        System.out.println(" Сумма в десятичной: " +a+ " + "+b+" = "+c);
        System.out.println(" Сумма в шеснадцатиричной: " +Integer.toHexString(a)+ " + "+Integer.toHexString(b)+" = "+Integer.toHexString(c));
        System.out.println(" Сумма в двоичной: " +Integer.toBinaryString(a)+ " + "+Integer.toBinaryString(b)+" = "+Integer.toBinaryString(c));
        System.out.println(" Сумма в Восьмиричной: " +Integer.toOctalString(a)+ " + "+Integer.toOctalString(b)+" = "+Integer.toOctalString(c));






    }
}
