
package com.UserManager;

public class Usuario {
    private int id_user,edad,telefono;
    private String nombre,apellido;
    
    public Usuario(){}
    
    public Usuario(int id_user, String nombre, String apellido, int edad, int telefono) {
        this.id_user = id_user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public String VerInfo(){
        return "ID usuario: "+id_user+"  Nombre: "+nombre+"  Apellido: "+apellido+"  Edad: "+edad+"  Telefono: "+telefono;
    }

}
