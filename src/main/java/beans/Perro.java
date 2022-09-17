
package beans;


public class Perro {
    
    private int idPerro;
    private String nombre;
    private String raza;
    private double peso;
    private int idDueño;

    public Perro(int idPerro, String nombre, String raza, double peso, int idDueño) {
        this.idPerro = idPerro;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.idDueño = idDueño;
    }

    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    @Override
    public String toString() {
        return "Perro{" + "idPerro=" + idPerro + ", nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", idDue\u00f1o=" + idDueño + '}';
    }
    
}
