
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
}
