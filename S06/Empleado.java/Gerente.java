package Empleado.java;

public class Gerente extends{
  //Declaración de atributos
    private String bonoProductividad;


    public Gerente(String nombre, int numeroEmpleado, int salario, String bonoProductividad) {
        super(nombre, numeroEmpleado, salario);
        this.bonoProductividad = bonoProductividad;
    }
}
