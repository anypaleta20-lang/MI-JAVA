public class Empleado {
   
    // Declaración de atributos
    protected String nombre;
    protected String numeroEmpleado;
    protected int salario;

    // Constructor
    public Empleado(String nombre, String numeroEmpleado, int salario) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
    }

    // Métodos
    void obtenerIdentificacion() {
        System.out.println("El empleado " + nombre + " se ha encend." );
    }

    void mostrarInfo() {
        System.out.println("El empleado " + nombre + " tiene el número de empleado " + numeroEmpleado + " y un salario de " + salario + " pesos.");
    }
}
