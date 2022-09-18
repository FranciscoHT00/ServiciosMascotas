
package beans;


public class Perro {
    
    private int idPerro;
    private String nombre;
    private String raza;
    private double peso;
    private int idUsuario;

    public Perro(int idPerro, String nombre, String raza, double peso, int idDueño) {
        this.idPerro = idPerro;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.idUsuario = idDueño;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Perro{" + "idPerro=" + idPerro + ", nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", idUsuario=" + idUsuario + '}';
    }    
    
}
