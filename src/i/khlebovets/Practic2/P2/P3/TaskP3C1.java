package i.khlebovets.Practic2.P2.P3;

import java.util.Scanner;

public class TaskP3C1
{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите размер желаемой зарплаты");
            int a = sc.nextInt();
        if (a<300||a>3000){
            System.out.println("Мы Вам перезвоним!!!");
        }
        else {
            for(int i=0;i<=14;i++){
                if(i<1||i>12){
                    System.out.println("Ваша зарплата в "+i+" месяц равна 0$");
                }
                else if(i==6||i==7||i==8){
                    if(a==666){
                        break;
                    }
                    else {
                        System.out.println("Ваша зарплата в " + i + " месяц равна " + a + "$");
                    }
                }
                else{
                    int b= (int) (a*1.5);
                    if (b==666){
                        break;
                    }
                    else {
                        System.out.println("Ваша зарплата в " + i + " месяц равна " + a * 1.5 + "$");
                    }
                }
            }
        }

    }
}
