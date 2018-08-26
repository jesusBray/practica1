package com.UserManager;

public class DataTable{

    public DataTable(){}
    
    
    
    public javax.swing.table.DefaultTableModel getTable(String[] column, String[][] row){
        return new javax.swing.table.DefaultTableModel(row, column
//            new Object [][] {
//                {null, null, null, null},
//                {null , null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Title 1", "Title 2", "Title 3", "Title 4"
//            }
        );
    }
}
