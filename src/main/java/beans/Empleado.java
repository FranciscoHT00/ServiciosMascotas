
package beans;


public class Empleado {
    
    private int idEmpleado;
    private String nombres;
    private String apellidos;

    public Empleado(int idEmpleado, String nombres, String apellidos) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
}
