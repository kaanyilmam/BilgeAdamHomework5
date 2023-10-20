package interfaces;

import enums.Colour;
import enums.EngineType;
import enums.GearType;
import enums.TireCount;

public interface IVehicle {

    void assignAttribute(EngineType engineType, Integer year, TireCount tireCount, String model, Colour colour, GearType gearType);

    void run();

    void stop();
}
