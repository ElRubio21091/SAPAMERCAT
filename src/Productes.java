abstract class Producte {

    protected String nom;
    protected double preu;
    protected String codiBarres;

    // Constructor
    public Producte(String nombre, double preu, String codiBarres) {
        this.nom = nombre;
        this.preu = preu;
        this.codiBarres = codiBarres;
    }


    public abstract double calcularPreu();

    // Getters
    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public String getCodiBarres() {
        return codiBarres;
    }
}
