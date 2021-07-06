import java.util.ArrayList;

abstract class Avion {
    protected String modele;
    protected int nbPlaces;
    protected int distanceMax;
    protected boolean vol_sol;
    protected ArrayList<Traveler> travelers;

    protected Avion(String modele, int nbPlaces, int distanceMax, boolean vol_sol){
        this.modele = modele;
        this.nbPlaces = nbPlaces;
        this.distanceMax = distanceMax;
        this.vol_sol = vol_sol;

    }

    abstract void addTravelers();

    abstract boolean fly();

    abstract void travelersList();

    abstract String getModele();

    abstract void setModele(String modele);

    abstract int getNbPlaces();

    abstract void setNbPlaces(int nbPlaces);

    abstract int getDistanceMax();

    abstract void setDistanceMax(int distanceMax);

    abstract boolean isVol_sol();

    abstract void setVol_sol(boolean vol_sol);

    abstract ArrayList<Traveler> getTravelers();

    abstract void setTravelers(ArrayList<Traveler> travelers);
}




