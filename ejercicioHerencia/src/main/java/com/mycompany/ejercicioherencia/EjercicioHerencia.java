package com.mycompany.ejercicioherencia;

public class EjercicioHerencia {

    public static void main(String[] args) {

        // Creamos instancias de la clase Empleado y Persona
        Empleado director = new Empleado("Ana", "López", "2483F", "Director");
        Empleado programador = new Empleado("Jorge", "Cruz", "8318M", "Programador");
        Empleado administrativo = new Empleado("Sergio", "Pérez", "8312K", "Administrativo");
        Persona cliente1 = new Persona("Luisa", "Sanchez", "8124G", "Granada");
        Persona cliente2 = new Persona("Carmen", "Ruiz", "4298P", "Zaragoza");

        // Creamos una instancia de la clase Empresa
        Empresa e = new Empresa();
            
        
        e.setDirector(new Empleado("Ana", "López", "2483F", "Director"));
        e.setProgramador(programador);
        e.setAdministrativo(administrativo);
        e.setCliente1(cliente1);
        e.setCliente2(cliente2);

        
        /*
            Cambiar el campo Nombre del Administrativo:
        
                Administrativo --> Nombre: "Pepe"
        */
        administrativo.setNombre("Pepe");

        
        /*
            Cambiar algunos datos de los Clientes:
        
                Cliente1 --> Apellido: "Gómez"
                Cliente2 --> "Jesús Íñiguez"
                               "2222J"
                               "Valladolid"
        */
        e.getCliente1().setApellidos("Gomez");
        e.setCliente2(new Persona("Jesus", "Íñiguez", "2222J", "Valladolid"));
        
        
        System.out.println("*****************************");
        System.out.println("*****************************");
        
        // Mostramos por pantalla los datos de Empleados y Clientes desde la clase Empresa
        System.out.println(e.toString()); 
        
        System.out.println("*****************************");
        System.out.println("*****************************");
   }
}







        /* Crear clase Persona
            - nombre (obligatorio)
            - apellidos (obligatorio)
            - nif (obligatorio)
            - ciudad (por defecto "desconocido", si no introducimos nada)
        
           Crear clase Empleado
            - categoria (obligatorio)
            - irpf (por defecto el 5%, si no introducimos nada)
            - departamento (por defecto "No aplica", si no introducimos nada)
        
           toString 
            (Carlos López
             12489X
             GR)
        
           toString
             (Carlos López
              12489X
              GR
              Director
              Ventas)



        Empleado e1 = new Empleado("Enrique", "Palma",  "48674187A", "Granada", "Director");
        Empleado e2 = new Empleado("Carlos", "López", "12489X", "Granada", "Director", "Ventas");
        Empleado e3 = new Empleado( "Luis", "García", "2346814D", "Subdirector");
        

        
        System.out.println(e1.toString());
        System.out.println("-------------------------");
        System.out.println(e2.toString());
        System.out.println("-------------------------");
        System.out.println(e3.toString());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println(em1.toString());
        */