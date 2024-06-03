package com.yakuperenermurat.v1;

import java.sql.*;

public class PostgreSqlConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sqlAllCustomers = "SELECT * FROM customers;";

        try{

            //  Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/companydb",
                    "postgres",
                    "yakup660");
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sqlAllCustomers);

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("customer_id") + " "+
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }
        }catch(SQLException e){
            System.out.println("Hata : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(resultSet != null||statement != null||connection != null){
                try {
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
