package skripka.lesson5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int mass[]=new int [15];
        int b=0;

        Random random=new Random();
        for (int i = 0; i < 15; i++) {
            mass[i]=random.nextInt(99);
            System.out.println(mass[i]+' ');
            if(mass[i]%2==0){
                b++;
            }
        }

        System.out.println("\n"+"Количесвто четных элементов массива: "+ b);

    }

        }
