package skripka.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = -13;
        int c = -12;
        int result1=0;
        int result2=0;
        int result3=0;
        int s=0;
        if(a>0){
            result1=1;

        }
        if(b>0){
            result2=1;
        }
        if(c>0){
            result3=1;
        }
        s=result1+result2+result3;
        System.out.println("How much positive numbers"+" "+s);
    }

    }
