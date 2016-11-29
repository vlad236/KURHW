package model;

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
        System.out.println(" Махалит"  + "("+ "обработка: " + (processed ? "обработан" : "не обработан") + ", прозрачность: " + getOpacity() + ", цена: " + getCost() + " руб., вес в граммах: " +  getWeight() + ")");
    }
}
