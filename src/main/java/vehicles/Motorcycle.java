package vehicles;

import abstracts.AbstractVehicle;
import enums.FuelType;
import enums.VehicleDimension;
import interfaces.IFuel;
import interfaces.IVehicle;

public class Motorcycle extends AbstractVehicle implements IFuel {
    private FuelType fuelType;
    private Integer fuelTankVolume;

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void setFuelTankVolume(Integer volume) {
        this.fuelTankVolume = volume;
    }

    @Override
    protected void assignVehicleDimension() {
        setDimension(VehicleDimension.SHORT);
    }
}
