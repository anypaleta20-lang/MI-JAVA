public class Main {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("Alicia en el país de las maravillas", 145, "Tim Borton");
        Serie s = new Serie("The Game of Trons", 55, 13);


        System.out.println("=".repeat(60));
        System.out.println("Pelicula de esteno");
        System.out.println("=".repeat(60));
        p.mostrarInfo();
        System.out.println("=".repeat(60));
        System.out.println("Serie favorita");
        System.out.println("=".repeat(60));
        s.mostrarInfo();
        System.out.println("=".repeat(60));


    }
}
