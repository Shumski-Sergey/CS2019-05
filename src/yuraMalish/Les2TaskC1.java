package yuraMalish;
import java.util.Scanner;
public class Les2TaskC1 {
     public static void main(String[] args) {
         System.out.println("Введите два целых числа");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println("Sum = " + (a+b));
    }
}
