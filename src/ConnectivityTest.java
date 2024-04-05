/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sharveshsakthivel
 */

import java.sql.*;
public class ConnectivityTest {
    Connection c;
    Statement s;
    public ConnectivityTest(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital?zeroDateTimeBehavior=CONVERT_TO_NULL");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new ConnectivityTest();
}

    
    
}