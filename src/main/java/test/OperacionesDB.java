
package test;

import beans.Perro;
import beans.Usuario;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesDB {
    
    public static void main(String[] args) {
        listarPerrosPorUsuario(1);
    }
    
    public static void actualizarUsuario(int idUsuario, Usuario pUsuario){
        
    }
    
    public static void listarPerrosPorUsuario(int pIdUsuario){
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM `perros` WHERE `idUsuario` = "+pIdUsuario;
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int idPerro = rs.getInt("idPerro");
                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                double peso = rs.getDouble("peso");
                int idUsuario = rs.getInt("idUsuario");
                
                Perro perro = new Perro(idPerro, nombre, raza, peso, idUsuario);
                System.out.println(perro.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
        
    }
}
