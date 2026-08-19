package S08.Sobreescritura;

public class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro, ladra.");
    }
}

