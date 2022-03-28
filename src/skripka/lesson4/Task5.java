package skripka.lesson4;

public class Task5 {
    public static void main(String[] args) {
    double a=2.54;
    double dium=0;
        for (int i = 1; i < 20; i++) {
            System.out.println(i+" "+"перевод в сантиметры");
           dium+=i*a;
            System.out.println("dium="+dium);
            
        }

    }

}
