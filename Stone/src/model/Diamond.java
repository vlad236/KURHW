package model;

public class Diamond extends Precious {

    private String shape;

    public Diamond(String shape, double weightCarat, double cost, double opacity) {
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
