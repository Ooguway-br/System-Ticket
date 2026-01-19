package Herance.Ingress;

public class FullTicket extends Ticket {

    public FullTicket(String film, String language){
        super(film, language, 20);
    }

    @Override
    public void showDetails() {
        System.out.println(" ==== FULL TICKET ====");
        System.out.println(" FILM: " + film);
        System.out.println(" LANGUAGE: " + language);
        System.out.println(" PRICE: US$ " + value);
        System.out.println(" ================ ");
    }
}
