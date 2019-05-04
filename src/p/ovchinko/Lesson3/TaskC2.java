package p.ovchinko.Lesson3;

import java.util.Scanner;

public class TaskC2 {
    private static int sumDigitsInNumber(int number){
        int sum = 0;
        while(number>0);{
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите четырехзначиное число : ");
        int a=sc.nextInt();
        System.out.println("Сумма цифр числа : " +sumDigitsInNumber(a));

    }


}
