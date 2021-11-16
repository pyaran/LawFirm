package util;

import people.*;
import services.*;

import java.security.Provider;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int time = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("what is your name");
        String name = input.nextLine();

        System.out.println("what is your last name");
        String lastname = input.nextLine();

        System.out.println("what kind of services are you looking for");
        System.out.println("\n* Legal advise\n* Divorce\n* Lawsuit\n* Representation\n* Taxation\n* Insurance\n* Will managing\n* Intelectual property");
        String service = input.nextLine();

        System.out.println("how many hours do you want your reunion to last?");
        time = input.nextInt();


        Client client = new Client(name,lastname,23,service);

        Interviewer interviewer = new Interviewer("Javier","Martinez", 25, client.getService());


        switch (interviewer.getService()){

            case "legal advise":

                System.out.println("\nwe will get a consultant for you");

                Consultant consultant = new Consultant("Rafael","Alvarez",28);
                LegalAdvice legalAdvice = new LegalAdvice(time);

                client.clientInfo();
                consultant.comsultantInfo();
                legalAdvice.adviceInfo();
                break;

            case "lawsuit":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer1 = new Lawyer("Eduardo","Gramajo",27, interviewer.getService());
                Lawsuit lawsuit = new Lawsuit(time);

                client.clientInfo();
                lawyer1.lawyerInfo();
                lawsuit.lawsuitInfo();
                break;

            case "representation":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer2 = new Lawyer("Augusto","Gonzalez",33, interviewer.getService());
                Representation representation = new Representation(time);

                client.clientInfo();
                lawyer2.lawyerInfo();
                representation.representationInfo();
                break;

            case "taxation":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer3 = new Lawyer("Nazareno","Saurral",29, interviewer.getService()+" law");
                Taxation taxation = new Taxation(time);

                client.clientInfo();
                lawyer3.lawyerInfo();
                taxation.taxationInfo();
                break;

            case "divorce":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer4 = new Lawyer("Estanislao","Cordoba",30, "Dispute resolution");
                FileForDivorce fileForDivorce = new FileForDivorce(time);

                client.clientInfo();
                lawyer4.lawyerInfo();
                fileForDivorce.DivorceInfo();
                break;

            case "insurance":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer5 = new Lawyer("Matias","Nuñez",33, interviewer.getService()+" law");
                Insurance insurance = new Insurance(time);

                client.clientInfo();
                lawyer5.lawyerInfo();
                insurance.insuanceInfo();
                break;

            case "will managing":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer6 = new Lawyer("Arturo","Armiñana",26, "will, trust and probate law");
                Will will = new Will(time);

                client.clientInfo();
                lawyer6.lawyerInfo();
                will.willInfo();
                break;

            case "intelectual property":

                System.out.println("\nwe will get a lawyer specialized in this type of cases");

                Lawyer lawyer7 = new Lawyer("Gonzalo","Pais",40, interviewer.getService() + " law");
                IntelectualProperty intelectualProperty = new IntelectualProperty(time);

                client.clientInfo();
                lawyer7.lawyerInfo();
                intelectualProperty.intelctualPropertyInfo();
                break;

            default:

                System.out.println("\nwe are sorry to inform that we don´t handle that type of cases");
        }



    }

}
