public class Laptop extends Device {

    private double screenSize;
    private String cpu;
    private int ram;
    private int storage;

    public Laptop(String type, double price, double weight,
                  double screenSize, String cpu, int ram, int storage) {

        super(type, price, weight);
        this.screenSize = screenSize;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}