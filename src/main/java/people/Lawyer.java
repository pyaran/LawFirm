package people;

public class Lawyer extends Person{

    private String specialty;

    public Lawyer(String name, String lastName, int age,String specialty) {
        super(name, lastName, age);
        this.specialty = specialty;

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void lawyerInfo(){
        String lawName = this.getName();
        String lawLastName= this.getLastName();
        int lawAge = this.getAge();
        String specialty = this.getSpecialty();

        System.out.println("\nlawyer´s info:");
        System.out.println("\nName: "+lawName+"\nlast name: "+lawLastName+"\nAge: "+lawAge+ "\nspecialty: "+specialty);
    }

}
