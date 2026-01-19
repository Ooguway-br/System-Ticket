package Herance.Ingress;

import java.util.Scanner;

public class Main {

    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Ticket ticket = null;

        System.out.println("\n====== TICKET SYSTEM ======");

        System.out.println("Enter the film name: ");
        String film = scanner.nextLine();

        System.out.println("Enter the language: ");
        System.out.println(" 1 -> === Portuguese === ");
        System.out.println(" 2 -> === English === ");
        int LanguageOption = scanner.nextInt();

        String language;
        if (LanguageOption == 1) {
            language = "PORTUGUESE";
        } else {
            language = "ENGLISH";
        }

        System.out.println("\nChoose the type of Ticket: ");
        System.out.println(" 1 -> Full Ticket");
        System.out.println(" 2 -> Half Ticket");
        System.out.println(" 3 -> Family Ticket");

        int TicketOption = scanner.nextInt();

        switch (TicketOption) {

            case 1:
                ticket = new FullTicket(film, language);
                break;


            case 2:
                ticket = new HalfTicket(film, language);
                break;


            case 3:
                System.out.println("Enter the number of people: ");
                int persons = scanner.nextInt();
                ticket = new FamilyTicket(film, language, persons);
                break;


            default:
                System.out.println("Invalid Option");
                scanner.close();
                return;
        }

        System.out.println("\n==== DETAILS OF TICKET ==== ");
        ticket.showDetails();

        scanner.close();
    }

}
