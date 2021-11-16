package people;

public class Consultant extends Person {

    public Consultant(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public void comsultantInfo() {
        String consultantName = this.getName();
        String consultantLastName = this.getLastName();
        int consultantAge = this.getAge();

        System.out.println("\nconsultant´s info:");
        System.out.println("\nName: " + consultantName + "\nlast name: " + consultantLastName + "\nAge: " + consultantAge);
    }
}

