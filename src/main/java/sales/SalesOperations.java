package sales;

import enums.SalesType;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Van;

import java.util.ArrayList;
import java.util.List;

public class SalesOperations {
    private List<CarSales> carSalesList;
    private List<VanSales> vanSalesList;
    private List<MotorCycleSales> motorCycleSalesList;
    private  List<BicycleSales> bicycleSalesList;


    public SalesOperations(){
        this.carSalesList = new ArrayList<>();
        this.vanSalesList = new ArrayList<>();
        this.motorCycleSalesList = new ArrayList<>();
        this.bicycleSalesList = new ArrayList<>();
    }

    public AbstractSales sell(SalesType type, List list){
        switch (type){
            case CAR_SALES -> {
                return sellCars(list);
            }
            case VAN_SALES -> {
                return sellVans(list);
            }
            case MOTORCYCLE_SALES -> {
                return sellMotorCycle(list);
            }
            case BICYCLE_SALES -> {
                return sellBicycle(list);
            }
        }
        return null;
    }
    public CarSales sellCars(List<Car> carList){
        if (carList == null || carList.size() == 0){
            return null;
        }
        CarSales carSales = new CarSales(carList);
        carSalesList.add(carSales);
        return carSales;
    }
    public VanSales sellVans(List<Van> vanList){
        if (vanList == null || vanList.size() == 0){
            return null;
        }
        VanSales vanSales = new VanSales(vanList);
        vanSalesList.add(vanSales);
        return vanSales;
    }
    public MotorCycleSales sellMotorCycle(List<Motorcycle> motorcycleList){
        if (motorcycleList == null || motorcycleList.size() == 0){
            return null;
        }
        MotorCycleSales motorCycleSales = new MotorCycleSales(motorcycleList);
        motorCycleSalesList.add(motorCycleSales);
        return  motorCycleSales;
    }
    public BicycleSales sellBicycle(List<Bicycle> bicycleList){
        if (bicycleList == null || bicycleList.size() == 0){
            return null;
        }
        BicycleSales bicycleSales = new BicycleSales(bicycleList);
        bicycleSalesList.add(bicycleSales);
        return bicycleSales;
    }
}
