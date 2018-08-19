package com.UserManager;

import javax.swing.JOptionPane;

public class characterChecker {
    
    public boolean CheckString(String date){
        for (int i = 0; i < date.length(); i++) {
            if (!Character.isAlphabetic(date.charAt(i))) {
                ErrorMessage("alfabetico");
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInt(String date){
        for (int i = 0; i < date.length(); i++) {
            if (!Character.isDigit(date.charAt(i))) {
                ErrorMessage("numerico");
                return false;
            }
        }
        return true;
    }

    private void ErrorMessage(String tipeDate){
        JOptionPane.showMessageDialog(null, "El dato deve ser "+tipeDate);
    }
}
