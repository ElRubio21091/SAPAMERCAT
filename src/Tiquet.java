import java.time.LocalDate;
import java.util.Map;

public class Tiquet {

    public static void imprimir(Map<Producte, Integer> carret) {
        System.out.println("SAPAMERCAT");
        System.out.println("Data: " + LocalDate.now());

        double total = 0;

        for (Map.Entry<Producte, Integer> entry : carret.entrySet()) {
            Producte p = entry.getKey();
            int q = entry.getValue();

            double preuUnit = p.calcularPreu();
            double subtotal = preuUnit * q;

            System.out.println(p.getNom() + " x" + q + " -> " + subtotal);
            total += subtotal;
        }

        System.out.println("TOTAL: " + total);
    }
}