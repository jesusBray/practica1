
package com.UserManager;

public class Usuario {
    private int id_user,edad,telefono;
    private String nombre,apellido;

    public Usuario(int id_user, String nombre, String apellido, int edad, int telefono) {
        this.id_user = id_user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public Usuario(String dato1,String dato2,String dato3) {
        
    }
    
    public Usuario(){}
    
    public int getId_usuario() {
        return id_user;
    }

    public void setId_usuario(int id_usuario) {
        this.id_user = id_usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String VerInfo(){
        return "ID usuario: "+id_user+"  Nombre: "+nombre+"  Apellido: "+apellido+"  Edad: "+edad+"  Telefono: "+telefono;
    }
    
}
