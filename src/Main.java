import java.time.LocalDate;
import java.util.*;

public class Main{

    static CarretCompra carret = new CarretCompra();
    static Scanner scanner = new Scanner(System.in);
    static List<Map<Producte, Integer>> historial = new ArrayList<>();

    public static void main(String[] args) {

        int opcio;
        System.out.println("BENVINGUTS AL SAPAMERCAT");
        do {
            System.out.println("-----------\n---INICI---\n-----------");
            System.out.println("1. Introduir producte");
            System.out.println("2. Pasar per caixa");
            System.out.println("3. Mostrar carret de la compra");
            System.out.println("0. Acabar");
            System.out.print("Introdueix el número de l'acció a executar: ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    menuAfegir();
                    break;
                case 2:
                    caixa();
                    break;
                case 3:
                    carret.mostrarCarret();
                default:
                    System.out.println("Acció no reconeguda: " + opcio);
            }
        } while (opcio !=0);
    }

    static void menuAfegir() {
        System.out.println("--------------\n---PRODUCTE---\n--------------");
        System.out.println("1. Alimentació");
        System.out.println("2. Tèxtil");
        System.out.println("3. Electronica");
        System.out.println("0. Tornar");
        System.out.print("Introdueix el número de l'acció a executar: ");
        int op = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Preu: ");
        double preu = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Codi: ");
        String codi = scanner.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("Data (YYYY-MM-DD): ");
                LocalDate data = LocalDate.parse(scanner.nextLine());
                carret.afegirProducte(new Alimentacio(nom, preu, codi, data));
            }
            case 2 -> {
                System.out.print("Composicio: ");
                String comp = scanner.nextLine();
                carret.afegirProducte(new Textil(nom, preu, codi, comp));
            }
            case 3 -> {
                System.out.print("Garantia dies: ");
                int dies = scanner.nextInt();
                carret.afegirProducte(new Electronica(nom, preu, codi, dies));
            }
            case 4 -> {
                return;
            }
        }
    }
    static void caixa() {
        Tiquet.imprimir(carret.getCarret());

        historial.add(new HashMap<>(carret.getCarret()));
        carret.buidar();
    }

}




