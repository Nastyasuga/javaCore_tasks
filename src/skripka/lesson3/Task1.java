package skripka.lesson3;

public class Task1 {
    public static void main(String[] args) {
       int value =123;
       String valueType;
        if (value>0){
            valueType=value+ "value is positive";

        }
        else{
            valueType=value+ "value is negative";

        }
int count=0;
        for( int i=value; i !=0 ; count++) {
            i /=10;
        }
        switch (count){
            case 1:{
        System.out.println(valueType+","+" one sign value");
        break;

    }
            case 2:{
        System.out.println(valueType+","+" two sign value");
        break;
    }
            case 3:{
        System.out.println(valueType+","+" three sign value");
        break;
    }
        }

    }
}
