package services;

public class FileForDivorce extends Services{


    private int fileForDivorceCost = 300;
    private String serviceProvided = "Divorce Filing";

    public FileForDivorce(int serviceTime) {
        super(serviceTime);
    }


    public void DivorceInfo(){
        System.out.println("\nService provided: "+ serviceProvided+"\nService cost: $"+fileForDivorceCost);
    }
}
