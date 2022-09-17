
package beans;

import java.sql.Date;
import java.sql.Time;


public class Cita {
    
    private int idPerro;
    private int idEmpleado;
    private Date fecha;
    private Time hora;
    private int idServicio;

    public Cita(int idPerro, int idEmpleado, Date fecha, Time hora, int idServicio) {
        this.idPerro = idPerro;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.hora = hora;
        this.idServicio = idServicio;
    }

    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public String toString() {
        return "Cita{" + "idPerro=" + idPerro + ", idEmpleado=" + idEmpleado + ", fecha=" + fecha + ", hora=" + hora + ", idServicio=" + idServicio + '}';
    }
    
}
