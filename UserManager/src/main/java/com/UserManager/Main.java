package com.UserManager;

public class Main 
{
    public static void main(String[] args) {
        UserManager asignacion = new UserManager(new ConectionSql("jdbc:mysql://localhost:3306/users","root", "root"));
        asignacion.setConsultaSQL("select * from usuario");
        asignacion.EjecutarConsulta();
        for (String arg : asignacion.ListarEtiquetas()) {
            System.out.println(arg);
        }

//        for (Usuario usuario : asignacion.ListarResultado()) {
//            System.out.println(usuario.VerInfo());
//        }
    }
}
