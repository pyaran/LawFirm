package services;

public class Will extends Services{

    private int willCost = 300;
    private String serviceProvided = "will managing";

    public Will(int serviceTime) {
        super(serviceTime);
    }

    public void willInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+willCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*willCost);
    }
}
