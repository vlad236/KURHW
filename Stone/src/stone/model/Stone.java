package stone.model;

import stone.Main;

public class Stone implements Comparable<Stone>{

    private double opacity;
    private double cost;
    private double weight;

    public Stone(double opacity, double cost, double weight) {
        this.opacity = opacity;
        this.cost = cost;
        this.weight = weight;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void show() {
        System.out.println(Main.res.getString("44"));
    }
    
    @Override
    public int compareTo(Stone obj) {
        return cost > obj.cost ? 1 : -1;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}