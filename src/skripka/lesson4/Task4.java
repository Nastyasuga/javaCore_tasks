package skripka.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("Вы ввели "+a);
        Scanner sp = new Scanner(System.in);
        System.out.println("Введите число");
        int b = sp.nextInt();
        System.out.println("Вы ввели "+b);

       for (int i=0;i<b;i++){
           sum+=a;

       }
        System.out.println("Multiplay"+sum);
    }
}
