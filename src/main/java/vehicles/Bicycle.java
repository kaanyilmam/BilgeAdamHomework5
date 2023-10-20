package vehicles;

import abstracts.AbstractVehicle;

public class Bicycle extends AbstractVehicle {

    @Override
    protected void assignVehicleDimension() {
        System.out.println("Empty Method...");
    }

    @Override
    public void run() {
        System.out.println("This method not use in vehicles.Bicycle...");
    }

    @Override
    public void stop() {
        System.out.println("This method not use in vehicles.Bicycle...");
    }
}
