package services;

public class Representation extends Services{

    private int representationCost = 200;
    private String serviceProvided = "Representation";

    public Representation(int serviceTime) {
        super(serviceTime);
    }


    public void representationInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+representationCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*representationCost);
    }

}