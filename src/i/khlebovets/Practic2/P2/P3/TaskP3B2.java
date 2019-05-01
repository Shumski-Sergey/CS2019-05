package i.khlebovets.Practic2.P2.P3;

import java.util.Scanner;

public class TaskP3B2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер сетки умножения");
        int a = sc.nextInt();
        int i=1;
        while(i<=a)
        {
            int j=1;
            while(j<=a)
            {
                System.out.print("|"+j*i+"|");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
