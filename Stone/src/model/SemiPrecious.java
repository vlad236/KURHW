package model;

public class SemiPrecious extends Stone{

    private double weight;

    public SemiPrecious(double weight, double cost, double opacity) {
        super(opacity, cost, weight);
        this.weight = super.getWeight();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.print("Полудрагоценный камень ");
    }
}