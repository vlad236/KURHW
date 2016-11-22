package model;

public class Precious extends Stone{

    private double weightCarat;

    public Precious(double weightCarat, double cost, double opacity) {
        super(cost, opacity);
        this.weightCarat = weightCarat;
    }

    public double getWeightCarat() {
        return weightCarat;
    }

    public void setWeightCarat(double weightCarat) {
        this.weightCarat = weightCarat;
    }

    public void show() {
        System.out.print("Драгоценный камень ");
    }
}