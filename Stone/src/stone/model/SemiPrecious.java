package stone.model;

import stone.Main;

public class SemiPrecious extends Stone{
	/**
	 * Вес камня в граммах
	 */
    private double weightGram;

    public SemiPrecious(double weight, double cost, double opacity) {
        super(opacity, cost, weight * 5);
        this.weightGram = weight;
    }

    public void show() {
        System.out.print(Main.res.getString("46"));
    }

	public double getWeightGram() {
		return weightGram;
	}

	public void setWeightGram(double weightGram) {
		this.weightGram = weightGram;
	}
}