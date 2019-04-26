package i.khlebovets;

import java.util.Scanner;

public class TaskC3
{
    private static double getWeight(int n)
    {
        double Earth=9.81;
        double Mars = 3.86;
        double e, m;
        e=n/Earth;
        m=e*Mars;
        m = Math.round(m*100)/100.0d;

        return m;

    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите массу человека:");
        int a=sc.nextInt();

        System.out.println("Macca на Марсе равна: "+getWeight(a));



    }
}
