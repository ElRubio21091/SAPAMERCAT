class Electronica extends Producto {

    private int diasGarantia;

    public Electronica(String nombre, double precio, String codigoBarras, int diasGarantia) {
        super(nombre, precio, codigoBarras);
        this.diasGarantia = diasGarantia;
    }

    @Override
    public double calcularPrecio() {
        return precio + precio * (diasGarantia / 365.0) * 0.1;
    }
}