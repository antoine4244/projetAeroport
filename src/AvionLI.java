import java.util.ArrayList;

public class AvionLI extends Avion{


    protected AvionLI(String modele, int nbPlaces, int distanceMax, boolean vol_sol) {
        super(modele, nbPlaces, distanceMax, vol_sol);
    }

    @Override
    void addTravelers() {

    }

    @Override
    boolean fly() {
        return false;
    }

    @Override
    void travelersList() {

    }

    @Override
    String getModele() {
        return null;
    }

    @Override
    void setModele(String modele) {

    }

    @Override
    int getNbPlaces() {
        return 0;
    }

    @Override
    void setNbPlaces(int nbPlaces) {

    }

    @Override
    int getDistanceMax() {
        return 0;
    }

    @Override
    void setDistanceMax(int distanceMax) {

    }

    @Override
    boolean isVol_sol() {
        return false;
    }

    @Override
    void setVol_sol(boolean vol_sol) {

    }

    @Override
    ArrayList<Traveler> getTravelers() {
        return null;
    }

    @Override
    void setTravelers(ArrayList<Traveler> travelers) {

    }
}
