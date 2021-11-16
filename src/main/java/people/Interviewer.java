package people;

public class Interviewer extends Person{

    private String service;

    public Interviewer(String name, String lastName, int age, String service) {
        super(name, lastName, age);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }


}