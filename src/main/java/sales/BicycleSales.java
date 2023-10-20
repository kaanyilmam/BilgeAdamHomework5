package sales;

import enums.SalesType;
import vehicles.Bicycle;

import java.util.List;

public class BicycleSales extends AbstractSales{
    private List<Bicycle> bicycleList;

    public BicycleSales(List<Bicycle> bicycleList){
        super(bicycleList.size(), SalesType.BICYCLE_SALES);
        this.bicycleList = bicycleList;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
