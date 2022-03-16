package skripka.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int value=0;
        String valueType;

        if(value>0 && value!=0){
            int val;
            val=++value;
            valueType=val+ "value  positive";
            System.out.println(valueType);


        }else if(value<0){ int sap;
            sap=value-2;
            valueType=sap+ "value is not  positive";
            System.out.println(valueType);

        }

        if(value==0){
            int frt=10;
            value=frt;
            valueType= value+ "value is zero";
            System.out.println(valueType);
        }


    }
         }
