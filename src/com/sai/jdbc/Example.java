package com.sai.jdbc;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class aClass = Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("");
            Statement statement = connection.createStatement();
            PreparedStatement stmt = connection.prepareStatement("insert into Emp values(?,?)");
            stmt.setInt(1, 101);//1 specifies the first parameter in the query
            stmt.setString(2, "Ratan");

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            //MetaData
            ResultSet rs=stmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

            //Database Metadata
            DatabaseMetaData dbmd=connection.getMetaData();

            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
