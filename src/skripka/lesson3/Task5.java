package skripka.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int a = 10;
        int b = -13;
        int c =-12;
        int result1=0;
        int result2=0;
        int result3=0;
        int res1=0;
        int res2=0;
        int res3=0;
        int s1=0;
        int s=0;

        if(a>0){
            result1=1;

        }else{
            res1=1;
        }
        if(b>0){
            result2=1;
        }else{
            res2=1;
        }
        if(c>0){
            result3=1;
        }else {
            res3=1;}
        s=result1+result2+result3;
        s1=res1+res2+res3;
        System.out.println("How much positive numbers"+" "+s);
        System.out.println("How much negative numbers"+" "+s1);
    }
}
