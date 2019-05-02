package i.khlebovets.Practic2.P2.P3;


import java.util.Scanner;

public class TaskP3A1
{
    public static void main(String[] args){
        System.out.println("Введите день недели (1-7)!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.print("Вы ввели понедьник");
                break;
            case 2:
                System.out.print("Вы ввели вторник");
                break;
            case 3:
                System.out.print("Вы ввели среда");
                break;
            case 4:
                System.out.print("Вы ввели четверг");
                break;
            case 5:
                System.out.print("Вы ввели пятница");
                break;
            case 6:
                System.out.print("Вы ввели суббота");
                break;
            case 7:
                System.out.print("Вы ввели воскресенье");
                break;
            default:
                System.out.print("Вы ввели не существующего дня");
                break;
        }


    }
}
