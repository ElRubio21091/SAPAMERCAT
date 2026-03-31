import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Alimentacio extends Producte {

    private LocalDate dataCaducitat;

    public Alimentacio(String nombre, double preu, String codiBarres, LocalDate dataCaducitat) {
        super(nombre, preu, codiBarres);
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public double calcularPreu() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), dataCaducitat);
        return preu - preu * (1.0 / (dias + 1)) + (preu * 0.1);
    }
}
