package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String host="192.168.225.30";
        String port="3306";
        //This code will work only for mysql database.
        Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/newjs");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("Select * from JPROFILE where email='personaa@js.in'");
        while(rs.next())  //otherwise it return the base index value i,e of 0 index as column name is there and throw error.
        {
            rs.getString("username");
        }


        System.out.println("Hello world!");
    }
}