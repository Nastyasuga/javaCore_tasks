package skripka.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Phone firstphone=new Phone();
        Phone secondphone=new Phone();
        Phone theredphone=new Phone();
        firstphone.model="Sumsung";
        firstphone.number=3456270;
        firstphone.weight=125;
        firstphone.displayInfo();
        firstphone.receiveCall();
        firstphone.getNumber();
        secondphone.model="Iphone";
        secondphone.number=5678894;
        secondphone.weight=432;
        secondphone.displayInfo();
        secondphone.receiveCall();
        secondphone.getNumber();
        theredphone.model="Huawei";
        theredphone.number=7986543;
        theredphone.weight=345;
        theredphone.displayInfo();
        theredphone.receiveCall();
        theredphone.getNumber();

    }
}
class Phone{
    int weight;
    String model;
    int number;
    String name="Alex";
    void displayInfo(){
        System.out.printf( "Model: %s \tWeight: %d\nnumber: ",model,weight,number);

    }
     int receiveCall(int number){
        System.out.println("Call"+number);
    }
    public void getNumber(){
        System.out.println(number);
    }
public Phone(String model,int number,int weight){
       this(number,model);
       this.weight=weight;

}
public Phone(int number,String model){
        this.number=number;
        this.model=model;
}
public Phone(){

}
public void receiveCall(String name,int number){
    System.out.println("name"+number);
}
}