package sales;

import enums.SalesType;
import vehicles.Car;

import java.util.List;

public class CarSales extends AbstractSales{
    private List<Car> carList;
    public CarSales(List<Car> carList ){
        super(carList.size(), SalesType.CAR_SALES);
        this.carList = carList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
