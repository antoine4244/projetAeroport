import java.util.ArrayList;

public class Aeroport {
    /** attributs **/
    private String lieu;
    private int capacite;
    private ArrayList<Avion> avions;
    private ArrayList<Billet> billets;


    /** constructeurs **/
    public Aeroport(String lieu, int capacite, ArrayList<Avion> avions, ArrayList<Billet> billets) {
        this.lieu = lieu;
        this.capacite = capacite;
        this.avions = avions;
        this.billets = billets;
    }

    /** méthodes **/
    public void addToAvions(){

    };

    public void showDispoAvion(){

    };

    public Billet buyBillet(){
        return null;
    };

    public void showNbPlaceByPlane(){

    };

    /** getters and setters **/
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public ArrayList<Avion> getAvions() {
        return avions;
    }

    public void setAvions(ArrayList<Avion> avions) {
        this.avions = avions;
    }

    public ArrayList<Billet> getBillets() {
        return billets;
    }

    public void setBillets(ArrayList<Billet> billets) {
        this.billets = billets;
    }
}
