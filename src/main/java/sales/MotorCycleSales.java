package sales;

import enums.SalesType;
import vehicles.Motorcycle;

import java.util.List;

public class MotorCycleSales extends AbstractSales{
    private List<Motorcycle> motorcycleList;

    public MotorCycleSales(List<Motorcycle> motorcycleList){
        super(motorcycleList.size(), SalesType.MOTORCYCLE_SALES);
        this.motorcycleList = motorcycleList;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
