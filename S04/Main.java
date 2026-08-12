public class Main {
    public static void main(String[] args) {
       
        Estudiante e1 = new Estudiante("Carlos", "Ing. en Sistemas", 9.2);
        Estudiante e2 = new Estudiante("Marco", "Lic. en Sistemas de Computación", 8.5);
        Estudiante e3 = new Estudiante("Juan", "Ing. Software", 7);
        Estudiante e4 = new Estudiante("Maribel", "Cirujano Dentista", 6.8);
   
        System.out.println("==================================================");
        e1.mostrarDatos();
        e1.evaluarRendimiento();
        System.out.println("==================================================");
        e2.mostrarDatos();
        e2.evaluarRendimiento();
        System.out.println("==================================================");
        e3.mostrarDatos();
        e3.evaluarRendimiento();
        System.out.println("==================================================");
        e4.mostrarDatos();
        e4.evaluarRendimiento();
        System.out.println("==================================================");
    }
}
