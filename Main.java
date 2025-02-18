public class Main {
    public static void main(String[] args) {
        Coche cocheNu = new Coche(1001, "1234ABC", "Toyota", "Yaris", "Rojo", 18000.0);

        cocheNu.aumentarPrecioPorcentaje(0.03);

        System.out.println("\nInformación del coche nuevo:");
        cocheNu.mostrarInfo();

        Coche2mano cocheAnt = new Coche2mano(2002, "5678DEF", "Ford", "Focus", "Blanco", 12000.0, 85000, 5);

        System.out.println("\nInformación del coche de segunda mano:");
        cocheAnt.mostrarInfo();

        Coche[] coches = new Coche[4];
        coches[0] = cocheNu;
        coches[1] = new Coche(1002, "1111AAA", "Honda", "Civic", "Azul", 22000.0);
        coches[2] = cocheAnt;
        coches[3] = new Coche2mano(2003, "9999ZZZ", "Seat", "Ibiza", "Negro", 10000.0, 95000, 7);

        System.out.println("\nRevisando el coche de segunda mano cocheAnt:");
        for (int i = 0; i < 3; i++) {
            boolean resultado = cocheAnt.revisar();
            System.out.println("Revisión " + (i + 1) + ": " + (resultado ? "Realizada" : "No realizada"));
        }

        System.out.println("\nMostrando toda la información de todos los coches:");
        for (Coche c : coches) {
            c.mostrarInfo();
        }

        System.out.println("\nMostrando solo el toString() de todos los coches:");
        for (Coche c : coches) {
            System.out.println(c);
        }

        System.out.println("\nProbando mostrarKms():");
        Coche.mostrarKms(cocheNu); // Coche nuevo
        Coche.mostrarKms(cocheAnt); // Coche de segunda mano
    }
}