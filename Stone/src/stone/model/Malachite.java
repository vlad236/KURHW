package stone.model;

import stone.Main;

public class Malachite extends SemiPrecious {

    private boolean processed;

    public Malachite(boolean processed, double weight, double cost, double opacity) {
        super(weight, cost, opacity);
        this.processed = processed;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public void show() {
        super.show();
        System.out.println(Main.res.getString("48")  + "("+ Main.res.getString("58") + (processed ? Main.res.getString("55") : Main.res.getString("56")) + Main.res.getString("51") + getOpacity() + Main.res.getString("52") + getCost() + Main.res.getString("54") +  getWeight() + ")");
    }
}
