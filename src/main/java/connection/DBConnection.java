
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    Connection connection;
    static String db = "mintic_servicio_mascotas";
    static String port = "3307";
    static String username = "root";
    static String password = "admin";

    public DBConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.db;
            connection = DriverManager.getConnection(url, this.username, this.password);
            System.out.println("Conexion exitosa");
        } catch (Exception ex) {
            System.out.println("Error en la conexion "+ex);
        }        
        
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
}
