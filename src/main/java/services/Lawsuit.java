package services;

public class Lawsuit extends Services{

    private int lawsuit= 200;
    private String serviceProvided = "lawsuit";

    public Lawsuit(int serviceTime) {
        super(serviceTime);
    }

    public void lawsuitInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+lawsuit+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*lawsuit);
    }
}
