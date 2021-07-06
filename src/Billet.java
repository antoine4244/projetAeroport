

public class Billet {
    private float prix;
    private String destination;
    private Traveler traveler;

    public Billet (float prix, String destination, Traveler traveler){
        this.prix = prix;
        this.destination = destination;
        this.traveler = traveler;
    }

    public void addDestination(){

    };

    public void addPassager(){

    };

    public void addPrice(){

    };

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }
}


