package i.khlebovets.Practic2.P2.P4;

import java.util.Scanner;

public class TaskP4A1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        var a = sc.nextInt();

        int [] nums=new int[a];

        for(int i=0;i<nums.length;i++){
            System.out.println("Введите число");
            nums[i] = sc.nextInt();
        }
        for (int i=nums.length-1;i>=0;i--){
            System.out.print("|"+ nums[i]);
        }


    }
}
