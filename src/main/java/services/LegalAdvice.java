package services;

public class LegalAdvice extends Services{

    private int consultCost = 150;
    private String serviceProvided = "Legal advice";

    public LegalAdvice(int serviceTime) {
        super(serviceTime);

    }

    public void adviceInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+consultCost+" usd per hour"+ "\nfinal cost: $"+getServiceTime()*consultCost);
    }

}

