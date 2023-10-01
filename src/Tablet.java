public class Tablet extends Device {

    private double screenSize;
    private boolean hasCellular;
    private int storage;

    public Tablet(String type, double price, double weight,
                  double screenSize, boolean hasCellular, int storage) {

        super(type, price, weight);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isHasCellular() {
        return hasCellular;
    }

    public void setHasCellular(boolean hasCellular) {
        this.hasCellular = hasCellular;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "screenSize=" + screenSize +
                ", hasCellular=" + hasCellular +
                ", storage=" + storage +
                '}';
    }
}