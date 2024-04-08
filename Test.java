package TpFinale;

// Test.java
public class Test {
    public static void main(String[] args) {
        UC uc = new UC(3.2, 16, 200);
        Peripherique[] peripheriques = {
            new Moniteur("M1", "Moniteur1", 5, 18, 1700),
            new Clavier("K1", "Clavier1", 102, 5)
        };
        PC pc0 = new PC(uc, peripheriques);
        try {
            double consommation = pc0.calConsoElec(5); // Durée en heures
            System.out.println("Consommation électrique pour une durée de 5 heures : " + consommation + " Watt");
        } catch (ConsoException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
