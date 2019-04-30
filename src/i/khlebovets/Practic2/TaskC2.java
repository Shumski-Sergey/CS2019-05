package i.khlebovets.Practic2;

import java.util.Scanner;

public class TaskC2
{
    public static int sumNums (int num)
    {
        int sum=0;

        while(num>0)
        {

            sum+=num%10;
            num=num/10;


        }

        return sum;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 4х-значное число!!!");
        int a=sc.nextInt();
        System.out.println("Сумма чисел числа "+a+" равна "+sumNums(a));

    }
}
