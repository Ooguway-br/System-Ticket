package Herance.Ingress;

public class FamilyTicket extends Ticket {

    protected int familyMembers;

    protected static final double discount = 0.05;

    public FamilyTicket(String film, String language, int familyMembers){
        super(film, language, 20);
        this.familyMembers = familyMembers;
        calculateFinalValue();
    }

    private void calculateFinalValue(){
        value = value * familyMembers;

        if (familyMembers > 3){
            value -= value * discount;
        }
    }

    @Override
    public void showDetails() {

        System.out.println("================ Family Ticket ================");
        System.out.println("FILM: " + film);
        System.out.println("LANGUAGE: " + language);
        System.out.println("NUMBER OF PEOPLE: " + familyMembers);
        System.out.println("TOTAL VALUE: US$ " + value);
        System.out.println("================================");

    }

}
