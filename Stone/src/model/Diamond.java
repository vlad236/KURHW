package model;

public class Diamond extends Precious {
	/**
	 * Цвет камня
	 */
    private String color;

    public Diamond(String color, double opacity, double cost, double weightCarat) {
        super(weightCarat, cost, opacity);
        this.color = color;
    }

    public String getShape() {
        return color;
    }

    public void setShape(String shape) {
        this.color = shape;
    }

    public void show() {
        super.show();
        System.out.println("Алмаз" + "("+ "цвет: " + color + ", прозрачность: " + getOpacity() + ", цена: " + getCost() + " руб., вес в каратах: " +  getWeightCarat() + ")");
    }
}