
package controller;


public interface IUsuarioController {
    
    public String login(String username, String password);
    
    public String registro(String username, String password, String email, boolean premium);
    
    public String mostrarUsuario(String username);
}
