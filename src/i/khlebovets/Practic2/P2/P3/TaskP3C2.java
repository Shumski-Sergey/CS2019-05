package i.khlebovets.Practic2.P2.P3;

import java.util.Scanner;

public class TaskP3C2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int a = sc.nextInt();
        System.out.println("Введите день месяца");
        int b = sc.nextInt();

        int[] days=new int[365];
        for(int i=0; i<days.length; i++)
        {
            days[i]= i+1;
        }
        switch (a)
        {
            case 1:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 2:
                if(b<=28&&b>0)
                System.out.println("Вы выбрали "+days[b+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 3:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 4:
                if(b<=30&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 5:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 6:
                if(b<=30&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 7:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 8:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31+30-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 9:
                if(b<=30&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31+30+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 10:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31+30+31+30-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 11:
                if(b<=30&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31+30+31+30+31-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            case 12:
                if(b<=31&&b>0)
                System.out.println("Вы выбрали "+days[b+31+28+31+30+31+30+31+30+31+30-1]+" день в 2018г");
                else{
                    System.out.println("Вы ввели несуществующий день");
                }
                break;
            default:
                System.out.println("Вы выбрали сеществующие месяц!!!");
                break;
        }



    }
}
