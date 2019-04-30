package i.khlebovets.Practic2;

import java.util.Scanner;

public class TaskC1
{
    public static double convertCelsiumToFarenheit (int tc)
    {
        double tf=((tc*9)/5)+32;

        return tf;

    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите значение по Цельсию!!!");
        int a=sc.nextInt();
        System.out.println("Значение по Фаренгейту "+convertCelsiumToFarenheit(a));

    }

}
