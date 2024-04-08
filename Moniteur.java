package TpFinale;

// Moniteur.java
public class Moniteur extends Peripherique {
    private int classeConsommation;
    private int dimension;
    private int resolutionMax;

    public Moniteur(String id, String modele, int classeConsommation, int dimension, int resolutionMax) {
        super(id, modele);
        this.classeConsommation = classeConsommation;
        this.dimension = dimension;
        this.resolutionMax = resolutionMax;
    }

    @Override
    public double calculerPuissance() {
        return classeConsommation * dimension + resolutionMax * 0.015;
    }
}

