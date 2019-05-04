package i.khlebovets.Practic2.P2.P4;


import java.util.ArrayList;
import java.util.Scanner;

public class TaskP4B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        var a = sc.nextInt();
        int [] nums=new int[a];

        for(int i=0;i<nums.length;i++){
            System.out.println("Введите число");
            nums[i] = sc.nextInt();
        }
        int k=nums.length/2;
        int m=nums.length-(nums.length/2);

        ArrayList am=new ArrayList(k);
        ArrayList b=new ArrayList(m);


        for(int i=0; i<k;i++){
            am.add(i,nums[i]);

        }


        for(int j=0, i=k; i<nums.length;i++,j++){

            b.add(j,nums[i]);
        }

        System.out.println("a=" +am.toString());
        System.out.println("b=" +b.toString());


    }
}
