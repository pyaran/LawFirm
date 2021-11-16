package services;

public class IntelectualProperty extends Services{

    private int intelectualPropertyCost = 400;
    private String serviceProvided = "Intelectual property managing";

    public IntelectualProperty(int serviceTime) {
        super(serviceTime);
    }

    public void intelctualPropertyInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+intelectualPropertyCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*intelectualPropertyCost);
    }
}

