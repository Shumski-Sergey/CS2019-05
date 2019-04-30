package yuraMalish;
import java.util.Scanner;
public class Les2TaskB1 {
    public static void main(String[] args){
        System.out.println("Введите число целое число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Квадрат вашего числа равен" + " " +(n*n) );
    }
}
