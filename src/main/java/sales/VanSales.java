package sales;

import enums.SalesType;
import vehicles.Van;

import java.util.List;

public class VanSales extends AbstractSales{
    private List<Van> vanList;
    public VanSales(List<Van> vanList){
        super(vanList.size(), SalesType.VAN_SALES);
        this.vanList = vanList;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
