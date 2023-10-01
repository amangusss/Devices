import java.util.Random;
public class Main {

    public static void main(String[] args) {

        int numDevices = 10; // get input
        Random rand = new Random();

        // Generate random devices
        Device[] devices = new Device[numDevices];

        for(int i=0; i<numDevices; i++) {
            // Pick random device type
            int type = rand.nextInt(3);

            if(type == 0) {
                devices[i] = new Smartphone("Smartphone", rand.nextInt(500),
                        rand.nextInt(200), rand.nextDouble()*5,
                        rand.nextInt(40));
            }
            else if(type == 1) {
                devices[i] = new Laptop("Laptop", rand.nextInt(1500),
                        rand.nextInt(2000), rand.nextDouble()*15, "Intel I7", rand.nextInt(8, 16), rand.nextInt(256, 1024) );
            }
            else {
                devices[i] = new Tablet("Tablet", rand.nextInt(700),
                        rand.nextInt(500), rand.nextDouble()*12, rand.nextBoolean(), rand.nextInt(64, 128));
            }
        }

        // Calculate totals
        double totalPrice = 0;
        double totalWeight = 0;

        for(Device d : devices) {
            totalPrice += d.getPrice();
            totalWeight += d.getWeight();
        }

        // Print results
        for (Device d : devices) {
            System.out.println(d.toString());
        }

        System.out.println("Total devices generated: " + devices.length);
        System.out.println("Total price of devices: $" + totalPrice);
        System.out.println("Total weight of devices: " + totalWeight + " g");
    }
}