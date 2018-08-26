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
<<<<<<< HEAD
            return myConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/users",this.user,this.password);
=======
            System.out.println("Checking data");
            if (Connect().isClosed()) {
                System.out.println("The database is turned off");
                return false;
            }
>>>>>>> 4b1cbdd3ad41ae05dfc01fe060b7ec0429c8b683
        }catch (Exception e) {
            System.out.println("Unable to establish connection " + e.getMessage());
            e.getStackTrace();
        }
        return null;
    }

    public void ExitConnection(){
        try {
<<<<<<< HEAD
            myConnection.close();
        } catch (Exception e) {
            System.out.println("error en "+e.getMessage());
=======
            System.out.println("Stable connection");
            return myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO",this.user,this.password);
        }catch (Exception e) {
            System.out.println("Connection error");
>>>>>>> 4b1cbdd3ad41ae05dfc01fe060b7ec0429c8b683
        }
    }
}
