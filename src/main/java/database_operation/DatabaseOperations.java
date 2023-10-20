package database_operation;

import enums.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DatabaseOperations {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/vehiclefabric";
        String username = "postgres";
        String password = "123456";


        public int saveVehicle(){
                try {
                        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                        String insertSQL = "INSERT INTO vehicles (model,year,color,engine_type,gear_type,tire_count,vehicle_dimenson) VALUES (?,?,?,?,?,?,?) RETURNING id";
                        PreparedStatement insertStatement = conn.prepareStatement(insertSQL);

                        insertStatement.setString(1, "Mercedes");
                        insertStatement.setString(2, "2012");
                        insertStatement.setString(3, Colour.WHITE.toString());
                        insertStatement.setString(4,EngineType.HAS_ENGINE.toString());
                        insertStatement.setString(5, GearType.OTOMATIC.toString());
                        insertStatement.setString(6, TireCount.FOUR_TIRE.toString());
                        insertStatement.setString(7, VehicleDimension.NORMAL.toString());

                        /*
                        String sqlQuery = "SELECT * FROM vehicles";
                        PreparedStatement queryStatement = conn.prepareStatement(sqlQuery);
                        ResultSet resultSet = queryStatement.executeQuery();
                        while (resultSet.next()){
                                System.out.println(resultSet.getString("color"));
                        }
                        */

                        ResultSet resultSet1 = insertStatement.executeQuery();
                        resultSet1.next();
                        var id = resultSet1.getArray(1);


                        System.out.println("INSERT işlemi sonucunda etkilenen satır idsi: "+id.toString() );


                        conn.close();

                        return Integer.parseInt(id.toString()) ;

                }catch (SQLException sqlException){
                        sqlException.printStackTrace();
                }
                return -1;
        }
        public void saveCarVehicle() throws SQLException {
                int yeniId = saveVehicle();
                Connection conn = DriverManager.getConnection(jdbcUrl,username,password);
                String insertSQL = "INSERT INTO car_vehicles(vehicle_id, tank_volume,fuel_type) VALUES (?,?,?)";



                PreparedStatement insertStatemnt = conn.prepareStatement(insertSQL);

                insertStatemnt.setInt(1, yeniId);
                insertStatemnt.setInt(2,63);
                insertStatemnt.setString(3, FuelType.GAS.toString());
                insertStatemnt.executeUpdate();
                conn.close();
        }
        public void saveVanVehicle() throws SQLException{
                int yeniId = saveVehicle();
                Connection conn = DriverManager.getConnection(jdbcUrl,username,password);
                String insertSQL = "INSERT INTO van_vehicles(vehicle_id) VALUES (?)";

                PreparedStatement insertStatemnt = conn.prepareStatement(insertSQL);

                insertStatemnt.setInt(1, yeniId);
                insertStatemnt.executeUpdate();
                conn.close();
        }
        public void saveMotocyle() throws SQLException{
                int yeniId = saveVehicle();
                Connection conn = DriverManager.getConnection(jdbcUrl,username,password);
                String insertSQL = "INSERT INTO motorcycle_vehicles(vehicle_id) VALUES (?)";

                PreparedStatement insertStatemnt = conn.prepareStatement(insertSQL);

                insertStatemnt.setInt(1, yeniId);
                insertStatemnt.executeUpdate();
                conn.close();
        }
}
