package mkavalevich.lesson03;


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float TC=sc.nextInt();
        float TF;
        TF = (TC * 9 / 5 + 32);
        System.out.println(TF);
    }
}
