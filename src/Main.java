//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
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
