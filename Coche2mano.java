public class Coche2mano extends Coche {
    private int km;
    private int anios;

    public Coche2mano() {
        super();
        this.km = 0;
        this.anios = 0;
    }
    public Coche2mano(int nb, String mat, String mar, String mod, String col, double pr, int km, int anios) {
        super(nb, mat, mar, mod, col, pr);
        this.km = km;
        this.anios = anios;
    }
    public void setKm(int n) {
        this.km = n;
    }
    public void setAnios(int n) {
        this.anios = n;
    }
    public int getKm() {
        return km;
    }
    public int getAnios() {
        return anios;
    }

    @Override
    public void mostrarInfo() {
        System.out.println();
        System.out.println("Número Bastidor: " + getNumBastidor());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Revisar: " + getRevisar());
        System.out.println("Revisiones:");
        for (int i = 0; i < 5; i++) {
            System.out.println(getRevisiones()[i]);
        }
        System.out.println("Kilómetros: " + this.km);
        System.out.println("Años: " + this.anios);
        System.out.println();
    }
}
