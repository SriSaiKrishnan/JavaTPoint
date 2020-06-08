package com.sai.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
CREATE TABLE  "IMGTABLE"
   (    "NAME" VARCHAR2(4000),
    "PHOTO" BLOB
   )
 */
public class InsertImage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sai","root","mysqladmin");

            PreparedStatement ps=con.prepareStatement("insert into img values(?,?)");
            ps.setString(1,"sai");

            FileInputStream fin=new FileInputStream("/Users/sv/Documents/Blackboard/Image.jpg");
            ps.setBinaryStream(2,fin,fin.available());
            int i=ps.executeUpdate();
            System.out.println(i+" records affected");

            con.close();
        }catch (Exception e) {e.printStackTrace();}
    }
}
