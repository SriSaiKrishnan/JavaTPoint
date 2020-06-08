package com.sai.jdbc;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.*;

public class RetriveFile {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sai","root","mysqladmin");

            PreparedStatement ps=con.prepareStatement("select * from file");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){//now on 1st row

                Clob c=rs.getClob(2);
                Reader r=c.getCharacterStream();

                FileWriter fw=new FileWriter("/Users/sv/Documents/Blackboard/RetriveFile.txt");

                int i;
                while((i=r.read())!=-1)
                    fw.write((char)i);

                fw.close();
            }//end of if
            System.out.println("ok");

            con.close();
        }catch (Exception e) {e.printStackTrace();  }
    }
}
