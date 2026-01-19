package Herance.Ingress;

public abstract class Ticket {

    protected String film;

    protected double value;

    protected String language;

    public Ticket(String Film, String language, double value) {

        this.film = Film;
        this.language = language;
        this.value = value;

    }

    public String getFilm() {
        return film;
    }

    public String getLanguage() {
        return language;
    }

    public abstract void showDetails();
}
