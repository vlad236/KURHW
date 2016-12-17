
package stone.model;

import stone.Main;

public class Ruby extends Precious {

    private int hardness;

    public Ruby(int hardness, double opacity, double cost, double weightCarat) {
        super(weightCarat, cost, opacity);
        this.hardness = hardness;
    }

    public void show() {
        super.show();
        System.out.println(Main.res.getString("47") + "("+ Main.res.getString("50") + hardness + Main.res.getString("51") + getOpacity() + Main.res.getString("52") + getCost() + Main.res.getString("53") +  getWeightCarat() + ")");
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }
}
