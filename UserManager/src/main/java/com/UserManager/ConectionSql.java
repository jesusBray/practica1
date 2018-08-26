package com.UserManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectionSql {
    private String user,password;
    private Connection myConnection = null;
    
    public ConectionSql(String user,String password) {
        this.user=user;
        this.password = password;
    }
    
    public boolean isConnected() {
        try{
            System.out.println("Checking data");
            if (Connect().isClosed()) {
                System.out.println("The database is turned off");
                return false;
            }
        }catch (Exception e) {
            System.out.println("Unable to establish connection " + e.getMessage());
            e.getStackTrace();
        }
        return true;
    }
    
    public Connection Connect() {
        try {
            System.out.println("Stable connection");
            return myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO",this.user,this.password);
        }catch (Exception e) {
            System.out.println("Connection error");
        }
        return myConnection;
    }
}
