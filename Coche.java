public class Coche {
    private int numBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private boolean revisar;
    private boolean[] revisiones = new boolean[5];

    Coche() {
        numBastidor = 0;
        matricula = "";
        marca = "";
        modelo = "";
        color = "";
        precio = 0.0;
        revisar = false;
    }
    Coche(int nb, String mat, String mar, String mod, String col, double pr, boolean rev, boolean[] revi) {
        this.numBastidor = nb;
        this.matricula = mat;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.precio = pr;
        this.revisar = rev;
        this.revisiones = revi;
    }
    public Coche(int nb, String mat, String mar, String mod, String col, double pr) {
        this.numBastidor = nb;
        this.matricula = mat;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.precio = pr;
    }

    public void setNumBastidor(int n) {
        this.numBastidor = n;
    }
    public void setmatricula(String s) {
        this.matricula = s;
    }
    public void setMarca(String s) {
        this.marca = s;
    }
    public void setModelo(String s) {
        this.modelo = s;
    }
    public void setColor(String s) {
        this.color = s;
    }
    public void setPrecio(double p) {
        this.precio = p;
    }
    public void setRevisar(boolean f) {
        this.revisar = f;
    }
    public void setRevisiones(boolean[] f) {
        this.revisiones = f;
    }

    public int getNumBastidor() {
        return numBastidor;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean getRevisar() {
        return revisar;
    }
    public boolean[] getRevisiones() {
        return revisiones;
    }

    public void aumentarPrecioPorcentaje(double d) {
        this.precio = this.precio * (1 + d);
    }
    public void mostrarInfo() {
        System.out.println();
        System.out.println("Número Bastidor: " + this.numBastidor);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Precio: " + this.precio);
        System.out.println("Revisar: " + this.revisar);
        System.out.println("Revisiones:");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.revisiones[i]);
        }
        System.out.println();
    }
    public boolean revisar() {
        for (int i = 0; i < revisiones.length; i++) {
            if (!revisiones[i]) {
                revisiones[i] = true;
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return this.matricula + " - " + this.marca + " - " + this.modelo;
    }
}
