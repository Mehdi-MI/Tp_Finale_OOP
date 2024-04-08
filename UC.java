package TpFinale;

// UC.java
public class UC {
    private double frequenceCPU;
    private int capaciteRAM;
    private double puissance;

    public UC(double frequenceCPU, int capaciteRAM, double puissance) {
        this.frequenceCPU = frequenceCPU;
        this.capaciteRAM = capaciteRAM;
        this.puissance = puissance;
    }

    public double getFrequenceCPU() {
        return frequenceCPU;
    }

    public int getCapaciteRAM() {
        return capaciteRAM;
    }

    public double getPuissance() {
        return puissance;
    }
}
