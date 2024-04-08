package TpFinale;

// Clavier.java
public class Clavier extends Peripherique {
    private int nbTouches;
    private double puissance;

    public Clavier(String id, String modele, int nbTouches, double puissance) {
        super(id, modele);
        this.nbTouches = nbTouches;
        this.puissance = puissance;
    }

    @Override
    public double calculerPuissance() {
        return puissance;
    }
}
