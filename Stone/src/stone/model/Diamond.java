package stone.model;

import stone.Main;

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
        System.out.println(Main.res.getString("59") + "("+ Main.res.getString("57") + color + Main.res.getString("51") + getOpacity() + Main.res.getString("52") + getCost() + Main.res.getString("53") +  getWeightCarat() + ")");
    }
}