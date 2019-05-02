package yuraMalish;

import java.util.Scanner;

public class Les3TaskC1 {
    private static double ConvertCelToFahr(int Cel){
        double F = Cel * 9/5 + 32;
        return  F;
    }
    public static void main(String [] args){
        System.out.println("Введите температуру в град Цельсия");
        Scanner sc= new Scanner(System.in);
        int Cel = sc.nextInt();
        double Tfahr = ConvertCelToFahr(Cel);
        System.out.println("Что состовляет " + Tfahr + " градусов по Форенгейту");

    }
}
