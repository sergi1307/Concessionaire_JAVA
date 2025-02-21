import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                int opc;
                boolean[] revs = new boolean[5];
                ArrayList<Coche> coches = new ArrayList<>();

                do {
                    System.out.println("1. Propuesto");
                    System.out.println("2. Información del vehículo");
                    System.out.println("3. Alta Vehículo");
                    System.out.println("4. Baja Vehículo");
                    System.out.println("5. Imprimir todos los vehículos");
                    System.out.println("6. Borrado total");
                    System.out.println("7. Salir");

                    opc = Leer.leerEntero("Introduzca que quiere hacer: ");

                    if (opc == 1) {
                        Coche cocheNu = new Coche(1001, "1234ABC", "Toyota", "Yaris", "Rojo", 18000.0);

                        cocheNu.aumentarPrecioPorcentaje(0.03);

                        System.out.println("\nInformación del coche nuevo:");
                        cocheNu.mostrarInfo();

                        Coche2mano cocheAnt = new Coche2mano(2002, "5678DEF", "Ford", "Focus", "Blanco", 12000.0, 85000, 5);

                        System.out.println("\nInformación del coche de segunda mano:");
                        cocheAnt.mostrarInfo();

                        coches.add(cocheNu);
                        coches.add(new Coche(1002, "1111AAA", "Honda", "Civic", "Azul", 22000.0));
                        coches.add(cocheAnt);
                        coches.add(new Coche2mano(2003, "9999ZZZ", "Seat", "Ibiza", "Negro", 10000.0, 95000, 7));

                        System.out.println("\nMostrando toda la información de todos los coches:");
                        for (Coche c : coches) {
                            c.mostrarInfo();
                        }

                        System.out.println("\nMostrando solo el toString() de todos los coches:");
                        for (Coche c : coches) {
                            System.out.println(c);
                        }

                        System.out.println("\nPasando las revisiones");
                        cocheNu.revisar();
                        cocheAnt.revisar();
                        System.out.println("Todas las revisiones pasadas");

                        System.out.println("\nProbando mostrarKms():");
                        mostrarKms(cocheNu);
                        mostrarKms(cocheAnt);
                    } else if (opc == 2) {
                        String matricula = Leer.leerTexto("Introduzca la matrícula del vehículo a eliminar: ");
                        boolean encontrado = false;

                        for (int i = 0; i < coches.size(); i++) {
                            if (coches.get(i).getMatricula().equals(matricula)) {
                                System.out.println(coches.get(i));
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El coche con esa matricula no existe.");
                        }

                    } else if (opc == 3) {
                        coches.add(new Coche(Leer.leerEntero("Introduzca el número de bastidor: "),
                                            Leer.leerTexto("Introduzca la matrícula: "),
                                            Leer.leerTexto("Introduzca la marca: "),
                                            Leer.leerTexto("Introduzca el modelo: "),
                                            Leer.leerTexto("Introduzca el color: "),
                                            Leer.leerDouble("Introduzca el precio: "),
                                            true,
                                            revs
                        ));
                    } else if (opc == 4) {
                        String matricula = Leer.leerTexto("Introduzca la matrícula del vehículo a eliminar: ");
                        boolean encontrado = false;

                        for (int i = 0; i < coches.size(); i++) {
                            if (coches.get(i).getMatricula().equals(matricula)) {
                                coches.remove(i);
                                System.out.println("Vehiculo eliminado.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El coche con esa matricula no existe.");
                        }


                    } else if (opc == 5) {
                        for (int i = 0; i < coches.size(); i++) {
                            System.out.println(coches.get(i));
                        }
                    } else if (opc == 6) {
                        System.out.println("Borrando Datos...");
                        coches.clear();
                    } else if (opc == 7) {
                        System.out.println("Nos vemos pronto.");
                    } else {
                        System.out.println("Error. Número introducido no válido.");
                    }
                } while (opc != 7);
            }
        public static void mostrarKms (Coche c){
            if (c instanceof Coche2mano) {
                Coche2mano coche2m = (Coche2mano) c;
                System.out.println("El coche de segunda mano tiene " + coche2m.getKm() + " km.");
            } else {
                System.out.println("Coche nuevo, con 0 km.");
            }
        }
}

