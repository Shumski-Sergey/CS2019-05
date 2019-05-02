package yuraMalish;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Les2TaskC3 {
    private static double ves( double m){
        double vesM = m/(9.81/3.86);
        return vesM;
    }
    public static void main(String[] args) {
        System.out.println("Введите вес, кг");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double vesM=ves(m);
        System.out.println("Ваш вес на Марсе " +  new DecimalFormat("0.00").format(vesM) + ", кг");


    }
}
