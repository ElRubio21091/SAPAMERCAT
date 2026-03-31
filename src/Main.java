import java.time.LocalDate;
import java.util.*;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcio;
        int opcioP;
        String nomP;
        int preu;
        int caducitat;
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
                    System.out.println("--------------\n---PRODUCTE---\n--------------");
                    System.out.println("1. Alimentació");
                    System.out.println("2. Tèxtil");
                    System.out.println("3. Electronica");
                    System.out.println("0. Tornar");
                    System.out.print("Introdueix el número de l'acció a executar: ");
                    opcioP = scanner.nextInt();
                    switch (opcioP) {
                        case 1:
                            System.out.println("Afegir alimentació\n");
                            System.out.print("Nom producte: ");
                            nomP=scanner.next();
                            System.out.println("\nPreu: ");
                            preu=scanner.nextInt();
                            System.out.println("\nCaducitat: ");
                            caducitat=scanner.nextInt();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 2:

                    break;
                case 3:

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

            }
            case 2 -> {
                System.out.print("Composicio: ");
                String comp = scanner.nextLine();

            }
            case 3 -> {
                System.out.print("Garantia dies: ");
                int dies = scanner.nextInt();

            }
            case 4 -> {
                return;
            }
        }
    }
}




