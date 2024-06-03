package com.yakuperenermurat.v2;

import java.sql.*;

//SQL  INSERT -- SELECT -- UPDATE -- DELETE
//JAVA CREATE --  READ  -- UPDATE -- DELETE
public class MyCrud {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    private boolean openConnection() {
        try {

            //  Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/companydb",
                    "postgres",
                    "yakup660");
            return true;

        } catch (SQLException e) {
            System.out.println("Hata : " + e);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private boolean closeConnection() {

        try {
           /* if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }*/
            if (!connection.isClosed()) {
                connection.close();
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Hata : " + e.getMessage());
            return false;
        }
    }


    //READ (SELECT)
    public ResultSet findFromTableRecordAll(String sql) throws SQLException {
        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı.");
            }
            return resultSet;
        } else {
            System.out.println("Bağlantı kapalı.");
            return null;
        }
    }

    //UPDATE
    public void updateFromTableRecord(String sql) throws SQLException {
        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }
    }
    //DELETE
    public void deleteFromTableRecord(String sql) throws SQLException {
        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }
    }

    public void insertFromTableRecord(String sql) throws SQLException  {
        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }
    }
}
