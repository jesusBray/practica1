package com.UserManager;

import java.sql.*;
import java.util.ArrayList;

public class UserManager {
    
    private ConectionSql connectSql = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private ArrayList<Usuario> lista = null;
    
    //este metodo es para mantener una coneccion con la ruta a la base de datos!
    public UserManager(ConectionSql connectSql) {
        this.connectSql=connectSql;
    }

    //el metodo da ordenes consultas a la ase de datos
    public PreparedStatement Consultar(String consulta) {
        try {
            if (connectSql.Connect() != null) {
                return preparedStatement = connectSql.Connect().prepareStatement(consulta);
            }
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
        return preparedStatement;
    }
    
    //el metodo cierra la ruta que hay entre las consultas y java
    public void ExitStatements() {
        try {
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("error en el siere consultas!"+e.getMessage());
        }
    }
    
    //el metodo ejecuta la consulta establesida
    public void EjecutarConsulta() {
        try {
            this.resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
        
    }

    //el metodo lista los resultados obtenidos 
    public ArrayList<Usuario> ListarResultado() { 
    
        try {
            lista = new ArrayList<Usuario>();
            while (this.resultSet.next()) {
                lista.add(new Usuario(this.resultSet.getInt("id_user"),this.resultSet.getString("nombre"),
                this.resultSet.getString("apellido"),this.resultSet.getInt("edad"),this.resultSet.getInt("telefono")));
            }
            return lista;
        } catch (Exception e) {
            System.out.println(" error en: "+e.getLocalizedMessage());
        }
        return lista;
    }

    public ResultSet getResultset() {
        return resultSet;
    }
    
    //el metodo imprime los datos obtenidos en la lista 
    public void InprimirLista(){
        for (Usuario usuario : lista) {
            //System.out.println(+.VerInfo());
        }
    }
    
    
}