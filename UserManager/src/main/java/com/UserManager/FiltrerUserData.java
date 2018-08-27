
package com.UserManager;

import java.sql.ResultSet;

public class FiltrerUserData {
   
    ResultSet resultSet;
    public FiltrerUserData(){}
    String dato;
    
// principios de SOLID 
    public boolean ValidationCadena(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetter(value.charAt(i))) 
                return true;
        }
        return false;
    }
    
    public boolean ValidationDataNumber(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i)))
                return true;
        }
        return false;
    }

    private boolean ValidationDataAge(String age) {
        if ((Integer.parseInt(age)) > 0 && Integer.parseInt(age) < 100) {
            for (int i = 0; i < age.length(); i++) {
                if (Character.isDigit(age.charAt(i))) {
                    System.out.println("Error en "+age);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    //validacion en datos;
    public int ValidateNumbers(String dato) {
        if (ValidationDataNumber(dato)) {
            return Integer.parseInt(dato);
        }
        return 0;
    }
    
    public void AsigneParametro(ResultSet result,String datoCadena){
        try {
            result.getString(ValidateString(this.dato));
        } catch (Exception e) {
            System.out.println("error en "+e.getMessage());
        }
    }
    
    public String ValidateString(String data) {
        if (ValidationCadena(data)) {
            return data;
        }
        return null;
    }
    
    public boolean ValidateAge(String age) {
        return ValidationDataNumber(age);
    }
    
    public boolean ValidateDirecction(String direcction) {
        return ValidationDataNumber(direcction);
    }
  
}
