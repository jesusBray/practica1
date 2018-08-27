package com.UserManager;

/**
 * Hello world!
 *
 */

interface MyFunctionalInterface {

	//A method with single parameter
    public int incrementByFive(int a);
}

public class Main 
{
    public static void main(String[] args) {
        ConectionSql coneccion = new ConectionSql("root", "root");
        UserManager asignacion = new UserManager(coneccion);
        asignacion.Consultar("select * from usuario");
        asignacion.EjecutarConsulta();
        for (Usuario usuario : asignacion.ListarResultado()) {
            System.out.println(usuario.VerInfo());
        }
//
//        MyFunctionalInterface f = (num) -> num+5;
//        System.out.println(f.incrementByFive(22));
//
        asignacion.InprimirLista();
        coneccion.ExitConnection();
        asignacion.ExitStatements();
    }
}
