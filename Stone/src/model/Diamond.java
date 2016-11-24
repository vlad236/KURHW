package model;

public class Diamond extends Precious {

    private String shape;

    public Diamond(String shape, double opacity, double cost, double weightCarat) {
        super(weightCarat, cost, opacity);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void show() {
        super.show();
        System.out.println("Алмаз");
    }
}
