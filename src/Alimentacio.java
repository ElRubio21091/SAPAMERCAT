import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Alimentacion extends Producto {

    private LocalDate fechaCaducidad;

    public Alimentacion(String nombre, double precio, String codigoBarras, LocalDate fechaCaducidad) {
        super(nombre, precio, codigoBarras);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPrecio() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), fechaCaducidad);
        return precio - precio * (1.0 / (dias + 1)) + (precio * 0.1);
    }
}
