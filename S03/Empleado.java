public class Empleado {

    String nombre;
    int numeroEmpleado;
    int salario;
    
    public Empleado (String nombre, int numeroEmpleado, int salario) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y mi número de empleado es " + numeroEmpleado + " y mi salario es de " + salario + " pesos.");