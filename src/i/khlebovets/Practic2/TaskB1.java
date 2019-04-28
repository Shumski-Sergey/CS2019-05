package i.khlebovets.Practic2;

import java.util.Scanner;




    public class TaskB1
    {

        public static double dis (int a, int b, int c)
        {
            double k=a;
            System.out.println("ВЫ ВВЕЛИ  "+a);
            double l= b;
            System.out.println("ВЫ ВВЕЛИ  "+b);
            double m= c;
            System.out.println("ВЫ ВВЕЛИ  "+c);

            double d;
            d=l*l-4*k*m;

            System.out.println("Дискриминант равен\t"+d);


            return d;

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

            double d=dis(a,b,c);

            if(d>0)
            {
                double x1,x2;

                x1=(-b+Math.sqrt(d))/(2*a);
                x2=(-b-Math.sqrt(d))/(2*a);

                System.out.println("Первый корень: "+x1+" Второй корень: "+x2);
            }
            else if (d==0)
            {
                double x;
                x=-b/(2*a);

                System.out.println("Дискриминант имеет один корень: "+x);
            }
            else
                {
                System.out.println("Отрицательный Дискриминант");
                }


        }
    }

