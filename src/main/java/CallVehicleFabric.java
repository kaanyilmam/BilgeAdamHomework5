import database_operation.DatabaseOperations;
import database_operation.DatabaseSaleOperations;
import enums.*;
import fabrics.VehicleFabric;
import files.FileOperations;
import files.IReadWriteOperations;
import returned_sales.ReturnedSalesOperations;
import returned_sales.ReturnedVehiclesSales;
import sales.*;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Van;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

public class CallVehicleFabric {

    public static void main(String[] args) throws SQLException {

        VehicleFabric vehicleFabric = new VehicleFabric();
        SalesOperations salesOperations = new SalesOperations();
        ReturnedSalesOperations returnedSalesOperations = new ReturnedSalesOperations();
        //IReadWriteOperations salesReadWrite = new FileOperations("sales.txt");
        //IReadWriteOperations returnSalesReadWrite = new FileOperations("returned_sales.txt");
        DatabaseOperations databaseOperations = new DatabaseOperations();


        //databaseOperations.saveCarVehicle();
        //databaseOperations.saveVanVehicle();
        //databaseOperations.saveMotocyle();

        DatabaseSaleOperations sales = new DatabaseSaleOperations();
        int vehicleId = 11;
        Date saleDate = Date.valueOf("2023-10-20");
        BigDecimal salePrice = new BigDecimal("20000.00");

        int saleId = sales.saveSale(vehicleId, saleDate, salePrice);

        /*
        vehicleFabric.productCar(100);
        vehicleFabric.productVans(100);
        vehicleFabric.productMotorcycles(500);
        vehicleFabric.productBicycles(30);

        List<String> resultList = salesReadWrite.read();
        for (String result: resultList){
            String[] split = result.split(",");
            if (split[1].equals("CAR_SALES")){
                vehicleFabric.sell(vehicleFabric.getCars(), Integer.parseInt(split[0]));
            }
            else if (split[1].equals("VAN_SALES")){
                vehicleFabric.sell(vehicleFabric.getVans(), Integer.parseInt(split[0]));
            }
            else if (split[1].equals("MOTORCYCLE_SALES")){
                vehicleFabric.sell(vehicleFabric.getMotorcycles(), Integer.parseInt(split[0]));
            }
            else if (split[1].equals("BICYCLE_SALES")){
                vehicleFabric.sell(vehicleFabric.getBicycles(), Integer.parseInt(split[0]));
            }
        }
        List<String> resultReturnSalesList = returnSalesReadWrite.read();
        for (String result: resultReturnSalesList) {
            String[] split = result.split(",");
            if (split[1].equals("CAR_SALES")) {
                vehicleFabric.productCar(Integer.parseInt(split[0]));
            } else if (split[1].equals("VAN_SALES")) {
                vehicleFabric.productVans(Integer.parseInt(split[0]));
            } else if (split[1].equals("MOTORCYCLE_SALES")) {
                vehicleFabric.productMotorcycles(Integer.parseInt(split[0]));
            } else if (split[1].equals("BICYCLE_SALES")) {
                vehicleFabric.productBicycles(Integer.parseInt(split[0]));
            }
        }

        vehicleFabric.printAll();
        List<Car> soldCars = vehicleFabric.sell(vehicleFabric.getCars(), 20);
        CarSales carSales = (CarSales) salesOperations.sell(SalesType.CAR_SALES, soldCars);
        salesReadWrite.write(carSales.toString());

        List<Motorcycle> soldMotorcycles = vehicleFabric.sell(vehicleFabric.getMotorcycles(), 10);
        MotorCycleSales motorCycleSales = (MotorCycleSales) salesOperations.sell(SalesType.MOTORCYCLE_SALES, soldMotorcycles);
        salesReadWrite.write(motorCycleSales.toString());

        List<Van> soldVans = vehicleFabric.sell(vehicleFabric.getVans(), 15);
        VanSales vanSales = (VanSales) salesOperations.sell(SalesType.VAN_SALES, soldVans);
        salesReadWrite.write(vanSales.toString());

        List<Bicycle> soldBicycles = vehicleFabric.sell(vehicleFabric.getBicycles(), 3);
        BicycleSales bicycleSales = (BicycleSales) salesOperations.sell(SalesType.BICYCLE_SALES, soldBicycles);
        salesReadWrite.write(bicycleSales.toString());

        System.out.println("----------------------------------------");

        vehicleFabric.printAll();

        ReturnedVehiclesSales returnedCarSales = returnedSalesOperations.returnSale(SalesType.CAR_SALES,5);
        returnSalesReadWrite.write(returnedCarSales.toString());
        vehicleFabric.productCar(returnedCarSales.getAmount());

        ReturnedVehiclesSales returnedVanSales = returnedSalesOperations.returnSale(SalesType.VAN_SALES,1);
        returnSalesReadWrite.write(returnedVanSales.toString());
        vehicleFabric.productVans(returnedVanSales.getAmount());

        ReturnedVehiclesSales returnedMotorcycleSales = returnedSalesOperations.returnSale(SalesType.MOTORCYCLE_SALES,10);
        returnSalesReadWrite.write(returnedMotorcycleSales.toString());
        vehicleFabric.productMotorcycles(returnedMotorcycleSales.getAmount());

        ReturnedVehiclesSales returnedBicycleSales = returnedSalesOperations.returnSale(SalesType.BICYCLE_SALES,1);
        returnSalesReadWrite.write(returnedBicycleSales.toString());
        vehicleFabric.productBicycles(returnedBicycleSales.getAmount());

        System.out.println("----------------------------------------");

        vehicleFabric.printAll();


        System.out.println("*********************************************");
        vehicleFabric.add(vehicleFabric.getSoldBicycles(), soldBicycles);
        vehicleFabric.add(vehicleFabric.getSoldMotorcycles(), soldMotorcycles);

        vehicleFabric.print(vehicleFabric.getSoldMotorcycles(), "Sold Motorcycles Size: ");
        vehicleFabric.print(vehicleFabric.getBicycles(), "Sold Bicycles Size: ");

        vehicleFabric.addAndPrintAll(vehicleFabric.getSoldCars(), soldCars, "Sold Cars Size: ");
        vehicleFabric.addAndPrintAll(vehicleFabric.getSoldVans(), soldVans, "Sold Vans Size: ");
       */
    }
}
