package com.mycompany.ejercicioherencia;

public class Empresa {
    
    /*
        Director (Empleado)
        Programador (Empleado)
        Administrativo (Empleado)
        Cliente 1 (Persona)
        Cliente 2 (Persona)
    
        Director:
            Ana López
            2483F
            Director
    
            Jorge Cruz
            8318M
            Programador
    
            Sergio Pérez
            8312K
            Administrativo
    
            Luis Sánchez
            8124G
            Granada
    
            Carmen Ruiz
            4298P
            Zaragoza
    */
    
    
    
        private Empleado director;
        private Empleado programador;
        private Empleado administrativo;
        private Persona cliente1;
        private Persona cliente2;
        
        
        public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public Empleado getProgramador() {
        return programador;
    }

    public void setProgramador(Empleado programador) {
        this.programador = programador;
    }

    public Empleado getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Empleado administrativo) {
        this.administrativo = administrativo;
    }

    public Persona getCliente1() {
        return cliente1;
    }

    public void setCliente1(Persona cliente1) {
        this.cliente1 = cliente1;
    }

    public Persona getCliente2() {
        return cliente2;
    }

    public void setCliente2(Persona cliente2) {
        this.cliente2 = cliente2;
    }
    
    @Override
    public String toString() {
        return  director + "\n" + "*****************************" + "\n" + programador + "\n" + "*****************************" + "\n" + administrativo + "\n" + "*****************************" + "\n"+ cliente1 + "\n" + "*****************************" + "\n" + cliente2;
    }
        
    
    
    
    /*
    // Campos de la clase Empresa
    Empleado director = new Empleado("Ana", "López", "2483F", "Director");
    Empleado programador = new Empleado("Jorge", "Cruz", "8318M", "Programador");
    Empleado administrativo = new Empleado("Sergio", "Pérez", "8312K", "Administrativo");
    Persona cliente1 = new Persona("Luisa", "Sanchez", "8124G", "Granada");
    Persona cliente2 = new Persona("Carmen", "Ruiz", "4298P", "Zaragoza");
    
    
    
    // Getter & Setter
    public Empleado getDirector() {
        return  director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public Empleado getProgramador() {
        return programador;
    }

    public void setProgramador(Empleado programador) {
        this.programador = programador;
    }

    public Empleado getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Empleado administrativo) {
        this.administrativo = administrativo;
    }

    public Persona getCliente1() {
        return cliente1;
    }

    public void setCliente1(Persona cliente1) {
        this.cliente1 = cliente1;
    }

    public Persona getCliente2() {
        return cliente2;
    }

    public void setCliente2(Persona cliente2) {    
        this.cliente2 = cliente2;
    }

    
    
    // Método toString()
    @Override
    public String toString() {
        return  director + "\n" + "------------------" + "\n" + programador + "\n" + "------------------" + "\n" + administrativo + "\n" + "------------------" + "\n"+ cliente1 + "\n" + "------------------" + "\n" + cliente2;
    }
    */
}