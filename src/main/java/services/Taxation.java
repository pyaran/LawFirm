package services;

public class Taxation extends Services{

    private int taxationCost = 300;
    private String serviceProvided = "taxation";

    public Taxation(int serviceTime) {
        super(serviceTime);
    }

    public void taxationInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+taxationCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*taxationCost);
    }
}
