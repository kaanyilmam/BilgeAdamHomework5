package database_operation;

import java.math.BigDecimal;
import java.sql.*;

public class DatabaseSaleOperations {
    String jdbcUrl = "jdbc:postgresql://localhost:5432/vehiclefabric";
    String username = "postgres";
    String password = "123456";

    public int saveSale(int vehicleId, Date saleDate, BigDecimal salePrice) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String insertSQL = "INSERT INTO sales (vehicle_id, sale_date, sale_price) VALUES (?, ?, ?) RETURNING id";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);

            insertStatement.setInt(1, vehicleId);
            insertStatement.setDate(2, saleDate);
            insertStatement.setBigDecimal(3, salePrice);

            ResultSet resultSet = insertStatement.executeQuery();
            resultSet.next();
            int saleId = resultSet.getInt(1);

            System.out.println("Satış başarıyla eklendi. Satış ID: " + saleId);


            connection.close();

            return saleId;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return -1;
    }
}
