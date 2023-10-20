package sales;

import enums.SalesType;

import java.util.Date;

public abstract class AbstractSales {
    private Date createdAt;
    private int amount;
    private SalesType type;
    private boolean isReturned;

    public AbstractSales(int amount, SalesType type) {
        this.amount = amount;
        this.type = type;
        this.createdAt = new Date();
        this.isReturned = false;
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

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
    @Override
    public String toString(){
        return this.amount + "," + this.type + "," + this.createdAt + "," + this.isReturned + "\n";
    }
}