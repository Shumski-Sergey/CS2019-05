package i.khlebovets.Practic2.P2.P3;

import java.util.Scanner;

public class TaskP3B1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int a = sc.nextInt();
        int b=a%4;
        if(b==0){
            System.out.println("В году 366 дней");
        }
        else{
            System.out.println("В году 365 дней");
        }

    }

}
