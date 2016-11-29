
package model;

public class Ruby extends Precious {

    private int hardness;

    public Ruby(int hardness, double opacity, double cost, double weightCarat) {
        super(weightCarat, cost, opacity);
        this.hardness = hardness;
    }

    public void show() {
        super.show();
        System.out.println(" Рубин" + "("+ "форма: " + hardness + ", прозрачность: " + getOpacity() + ", цена: " + getCost() + " руб., вес в каратах: " +  getWeightCarat() + ")");
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }
}
