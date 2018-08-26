package com.UserManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionSql {
    private String user,password;
    private Connection myConnection = null;
    
    public ConectionSql(String user,String password) {
        this.user=user;
        this.password = password;
    }
    
    public Connection Connect() {
        try{
            return myConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/users",this.user,this.password);
        }catch (Exception e) {
            System.out.println("No se pudo estableder coneccion " + e.getMessage());
            e.getStackTrace();
        }
        return null;
    }

    public void ExitConnection(){
        try {
            myConnection.close();
        } catch (Exception e) {
            System.out.println("error en "+e.getMessage());
        }
    }
}
