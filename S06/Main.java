public class Main {
    public static void main(String[] args) {
       
        Animal miAnimal = new Animal("Animal", 5);
        miAnimal.sonido();


        Perro miPerro = new Perro("Oddie", 10, "Schnauzer");
        miPerro.sonido();
        miPerro.moverCola();
    }
}
