package returned_sales;

import enums.SalesType;

import java.util.Date;

public class ReturnedVehiclesSales {
    private Date createdAt;
    private int amount;
    private SalesType type;

    public ReturnedVehiclesSales(int amount, SalesType type){
        this.amount = amount;
        this.type = type;
        this.createdAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SalesType getType() {
        return type;
    }

    public void setType(SalesType type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return this.amount + "," + this.type + "," + this.createdAt +"\n";
    }
}
