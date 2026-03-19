abstract class Producto {

    protected String nombre;
    protected double precio;
    protected String codigoBarras;

    // Constructor
    public Producto(String nombre, double precio, String codigoBarras) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
    }


    public abstract double calcularPrecio();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
}
