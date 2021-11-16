package services;

public class Insurance extends Services{
    private int insuranceCost = 400;
    private String serviceProvided = "insurance";

    public Insurance(int serviceTime) {
        super(serviceTime);
    }


    public void insuanceInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+insuranceCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*insuranceCost);
    }

}
