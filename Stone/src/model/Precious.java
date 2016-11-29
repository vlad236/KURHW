package model;

public class Precious extends Stone{
	/**
	 * Вес камня в каратах
	 */
    private double weightCarat;

    public Precious(double weightCarat, double cost, double opacity) {
        super(opacity, cost, weightCarat);
        this.weightCarat = super.getWeight();
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