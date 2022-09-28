
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import beans.Usuario;
import com.google.gson.Gson;
import connection.DBConnection;


public class UsuarioController implements IUsuarioController{
    
    @Override
    public String login(String username, String password){
        
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM `usuarios` WHERE `username` = '" + username + "' AND `password` = '" + password + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int idUsuario = rs.getInt("idUsuario");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String direccion = rs.getString("direccion");
                double saldo = rs.getDouble("saldo");
                boolean premium = rs.getBoolean("premium");
                
                Usuario usuario = new Usuario(idUsuario, username, nombres, apellidos, email, password, direccion, saldo, premium);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
        
        return "false";
    }

    @Override
    public String registro(String username, String password, String email, boolean premium) {
        
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        int resultado = -1;
        
        String sql = "SELECT * FROM `usuarios` WHERE `username` = '" + username + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(!rs.isBeforeFirst()){
               
                String sql2 = "INSERT INTO `usuarios` (`username`, `password`, `email`, `premium`) VALUES "
                        + "('"+username+"', '"+password+"', '"+email+"', "+premium+")";
                
                try {
                    Statement st2 = con.getConnection().createStatement();                    
                    resultado = st2.executeUpdate(sql2);
                    st2.close();
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }else{
                resultado = 0;
            }            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
        
        return gson.toJson(resultado);
    }

    @Override
    public String mostrarUsuario(String username) {
        
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM `usuarios` WHERE `username` = '" + username + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int idUsuario = rs.getInt("idUsuario");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String direccion = rs.getString("direccion");
                double saldo = rs.getDouble("saldo");
                boolean premium = rs.getBoolean("premium");
                
                Usuario usuario = new Usuario(idUsuario, username, nombres, apellidos, email, password, direccion, saldo, premium);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
        
        return "false";
    }
    
    
}
