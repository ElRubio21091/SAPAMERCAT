import java.util.*;
import java.util.stream.Collectors;

public class CarretCompra {

    private Map<Producte, Integer> carret = new HashMap<>();

    public void afegirProducte(Producte p) {
        // Textil no duplicado por código barras
        if (p instanceof Textil) {
            boolean existe = carret.keySet().stream()
                    .anyMatch(prod -> prod.getCodiBarres().equals(p.getCodiBarres()));

            if (existe) {
                System.out.println("Textil duplicat!");
                return;
            }
        }

        carret.put(p, carret.getOrDefault(p, 0) + 1);
    }

    public void mostrarCarret() {
        carret.forEach((p, q) ->
                System.out.println(p.getNom() + " x" + q)
        );
    }

    public void buidar() {
        carret.clear();
    }

    public Map<Producte, Integer> getCarret() {
        return carret;
    }

    public Optional<String> buscarNomPerCodi(String codi) {
        return carret.keySet().stream()
                .filter(p -> p.getCodiBarres().equals(codi))
                .map(Producte::getNom)
                .findFirst();
    }
}
