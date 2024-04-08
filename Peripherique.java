package TpFinale;
// Peripherique.java
public abstract class Peripherique {
    protected String id;
    protected String modele;

    public Peripherique(String id, String modele) {
        this.id = id;
        this.modele = modele;
    }

    public abstract double calculerPuissance();
}
