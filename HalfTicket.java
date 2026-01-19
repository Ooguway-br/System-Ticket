package Herance.Ingress;

public class HalfTicket extends Ticket {

    public HalfTicket(String film, String language){
        super(film, language, 10);
    }

    @Override
    public void showDetails(){
        System.out.println(" ==== HALF TICKET ==== ");
        System.out.println(" Film: " + film);
        System.out.println(" Language: " + language);
        System.out.println(" Price: US$ " + value);
        System.out.println(" ================ ");

    }
}
