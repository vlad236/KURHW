package model;

public class Stone implements Comparable<Stone>{

    private double opacity;
    private double cost;

    public Stone(double opacity, double cost) {
        this.opacity = opacity;
        this.cost = cost;
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
        System.out.println("Это камень");
    }
    
    @Override
    public int compareTo(Stone obj) {
        return cost > obj.cost ? 1 : -1;
    }
}