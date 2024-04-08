package TpFinale;

// PC.java
public class PC {
    private UC uc;
    private Peripherique[] peripheriques;

    public PC(UC uc, Peripherique[] peripheriques) {
        this.uc = uc;
        this.peripheriques = peripheriques;
    }

    public PC(PC pc) {
        this.uc = pc.uc;
        this.peripheriques = pc.peripheriques;
    }

    public double calConsoElec(double duree) throws ConsoException {
        double consoTotale = uc.getPuissance();
        for (Peripherique p : peripheriques) {
            consoTotale += p.calculerPuissance();
        }
        double consoElec = consoTotale * duree;
        if (consoElec > 1000) {
            throw new ConsoException("La consommation électrique dépasse 1000.");
        }
        return consoElec;
    }
}
