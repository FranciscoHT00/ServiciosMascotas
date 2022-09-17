
package beans;


public class ListaHorario {
    
    private int idEmpleado;
    private int idHorario;

    public ListaHorario(int idEmpleado, int idHorario) {
        this.idEmpleado = idEmpleado;
        this.idHorario = idHorario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    @Override
    public String toString() {
        return "ListaHorario{" + "idEmpleado=" + idEmpleado + ", idHorario=" + idHorario + '}';
    }
    
}
