package i.khlebovets.Practic2;



import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class TaskB1
{
    public class TaskA1
    {

        public static double dis (int a, int b, int c)
        {
            int k= Math.sqrt(a);
            System.out.println("ВЫ ВВЕЛИ  "+a);
            int l= Math.sqrt(b);
            System.out.println("ВЫ ВВЕЛИ  "+b);
            int m= Math.sqrt(c);
            System.out.println("ВЫ ВВЕЛИ  "+c);
            return (double)k, (double)l, (double)m;

        }


        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Введите 1ое число!!!");
            int a=sc.nextInt();
            System.out.println("Введите 2ое число!!!");
            int b=sc.nextInt();
            System.out.println("Введите 3ое число!!!");
            int c=sc.nextInt();

            dis(a,b,c);


            System.out.println();

        }
    }
}
