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
        String nom = llegirString();

        System.out.print("Preu: ");
        double preu = llegirDouble();

        System.out.print("Codi: ");
        String codi = llegirString();

        switch (op) {
            case 1 -> {
                System.out.print("Data (YYYY-MM-DD): ");
                try {
                    LocalDate data = LocalDate.parse(llegirString());
                    carret.afegirProducte(new Alimentacio(nom, preu, codi, data));
                } catch (Exception e) {
                    System.out.println("Data incorrecta!");
                }
            }
            case 2 -> {
                System.out.print("Composicio: ");
                String comp = llegirString();
                carret.afegirProducte(new Textil(nom, preu, codi, comp));
            }
            case 3 -> {
                System.out.print("Garantia dies: ");
                int dies = llegirInt();
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

    static double llegirDouble() {
        while (true) {
            try {
                double valor = Double.parseDouble(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un número correcte: ");
            }
        }
    }

    static int llegirInt() {
        while (true) {
            try {
                int valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un enter correcte: ");
            }
        }
    }

    static String llegirString() {
        return scanner.nextLine();
    }

}




