package Empleado;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String name, int salario, String departamento) {
        super(name, salario);
        this.departamento = departamento;
    }

    @Override
    void mostrarInfo() {
        System.out.println(
            "Nombre: " + name +
          "\n   > Salario: " + salario + " USD." +
          "\n   > Departamento: " + departamento
        );
    }
    
}
