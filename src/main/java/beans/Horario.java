
package beans;

import java.sql.Time;


public class Horario {
    
    private int idHorario;
    private int dia;
    private Time hora;

    public Horario(int idHorario, int dia, Time hora) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.hora = hora;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", dia=" + dia + ", hora=" + hora + '}';
    }
    
}
