package interfaces;

import enums.FuelType;

public interface IFuel {
    void setFuelType(FuelType fuelType);

    void setFuelTankVolume(Integer volume);
}
