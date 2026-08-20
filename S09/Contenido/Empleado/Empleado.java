package Empleado;

public class Empleado {
    protected String name;
    protected int salario;

    public Empleado(String name, int salario) {
        this.name = name;
        this.salario = salario;
    }

    void mostrarInfo() {
        System.out.println(
            "Nombre: " + name +
          "\n   > Salario: " + salario + " USD."
        );
    }
}
