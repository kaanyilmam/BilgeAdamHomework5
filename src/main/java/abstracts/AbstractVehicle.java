package abstracts;

import enums.*;
import interfaces.IVehicle;

public abstract class AbstractVehicle implements IVehicle {

    protected abstract void assignVehicleDimension();

    private EngineType engineType;
    private Integer year;
    private TireCount tireCount;
    private String model;
    private Colour colour;
    private GearType gearType;
    private VehicleDimension dimension;

    @Override
    public void assignAttribute(EngineType engineType, Integer year, TireCount tireCount, String model, Colour colour, GearType gearType) {
        setEngineType(engineType);
        setColour(colour);
        setModel(model);
        setGearType(gearType);
        setTireCount(tireCount);
        setProductionYear(year);
    }

    @Override
    public void run() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public void setProductionYear(Integer year) {
        this.year = year;
    }

    public void setTireCount(TireCount tireCount) {
        this.tireCount = tireCount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Integer getProductionYear() {
        return year;
    }

    public TireCount getTireCount() {
        return tireCount;
    }

    public String getModel() {
        return model;
    }

    public Colour getColour() {
        return colour;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setDimension(VehicleDimension dimension) {
        this.dimension = dimension;
    }

    public VehicleDimension getDimension() {
        return dimension;
    }
}
