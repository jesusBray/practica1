package com.UserManager;

import java.sql.*;
import java.util.ArrayList;

public class UserManager {
    
    private ConectionSql connectSql = null;
    private Connection conection;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData rsultado;
    private ArrayList<Usuario> lista = null;
    private String[]etiquetas;
    private String consulta = null;
    
    
    public UserManager(ConectionSql connectSql) {
        this.connectSql=connectSql;
    }
    
    //este metodo es para mantener una coneccion con la ruta a la base de datos!
    public void conectionSql(){
        conection = connectSql.Connect();
    }
    
    //el metodo cierra coneccion con la coneccion sql
    
    public void setConsultaSQL(String consulta) {
        this.consulta = consulta;
    }
    
    //el metodo da ordenes consultas a la ase de datos
    public void Consultar() {
        try {
            conectionSql();
            if (preparedStatement!= null) {
                preparedStatement = conection.prepareStatement(consulta);
            }
            else{
                preparedStatement = conection.prepareStatement(consulta);
            }
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
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
            Consultar();
            this.resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println("error en: "+e.getMessage());
        }
    }
    
    //el metodo cierra coneccion con las consultas hechas a la base de datos
    public void ExitConection(){
        try {
            resultSet.close();
            preparedStatement.close();
            conection.close();
        } catch (Exception e) {
            System.out.println("erro en el sierre "+e.getMessage());
        }
    }
    
    //el metodo lista los resultados obtenidos 
    public ArrayList<Usuario> ListarResultado() {     
        try {
            EjecutarConsulta();
            lista = new ArrayList<>();
            while (this.resultSet.next()) {
                lista.add(new Usuario(this.resultSet.getInt("id_user"),this.resultSet.getString("nombre"),
                this.resultSet.getString("apellido"),this.resultSet.getInt("edad"),this.resultSet.getInt("telefono")));
            }
            ExitConection();
            return lista;
        } catch (Exception e) {
            System.out.println(" error en: "+e.getLocalizedMessage());
        }
        return lista;
    }
    
    //el metodo muestra los nombres de campo en la base de datos
    public String[] ListarEtiquetas() {         
        try {
            EjecutarConsulta();
            resultSet.getMetaData();
            rsultado = resultSet.getMetaData();
            etiquetas= new String[rsultado.getColumnCount()];
            etiquetas[0] = rsultado.getColumnName(1);
            etiquetas[1] = rsultado.getColumnName(2);
            etiquetas[2] = rsultado.getColumnName(3);
            etiquetas[3] = rsultado.getColumnName(4);
            etiquetas[4] = rsultado.getColumnName(5);
            ExitConection();
            return etiquetas;
        } catch (Exception e) {
            System.out.println(" error en aqui: "+e.getLocalizedMessage());
        }
        return null;
    }
    
}