package returned_sales;

import enums.SalesType;

import java.util.ArrayList;
import java.util.List;

public class ReturnedSalesOperations {
    private List<ReturnedVehiclesSales> returnedVehiclesSalesList;

    public ReturnedSalesOperations(){
        this.returnedVehiclesSalesList = new ArrayList<>();
    }
    public ReturnedVehiclesSales returnSale(SalesType type, int amount){
        ReturnedVehiclesSales returnedVehiclesSales = new ReturnedVehiclesSales(amount, type);
        returnedVehiclesSalesList.add(returnedVehiclesSales);
        return returnedVehiclesSales;
    }
}
