package people;

public class Client extends Person {
    private Boolean difficultCase;
    private String service;

    public Client(String name, String lastName, int age, String service) {
        super(name, lastName, age);
        this.service = service;


    }


    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void clientInfo() {
        String clientName = this.getName();
        String clientLastName = this.getLastName();
        int clientAge = this.getAge();
        String service = this.service;

        System.out.println("\nClient´s info:");
        System.out.println("\nName: " + clientName + "\nlast name: " + clientLastName + "\nAge: " + clientAge + "\ntype of service: "+ service);

    }
}
