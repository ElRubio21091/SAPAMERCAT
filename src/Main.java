//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
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

                break;
            case 2:

                break;
            case 3:

            default:
                System.out.println("Acció no reconeguda: " + opcio);
        }
    } while (opcio !=0);
}
