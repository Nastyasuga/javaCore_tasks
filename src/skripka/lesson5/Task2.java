package skripka.lesson5;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int [50];
        for(int i=0, j=1; j<=99; i++){
            if(j%2==1){
                mass[i]=j;
                j+=2;
            }
            System.out.print(mass[i] + " ");
        }

        System.out.println("\n");

        int[] demass = new int[50];
        for(int i=0, j=99; j>=1; i++){
            if(j%2==1){
                demass[i]=j;
                j-=2;
            }
            System.out.print(demass[i] + " ");
        }
    }
    }





