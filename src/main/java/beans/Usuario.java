
package beans;


public class Usuario {
    
    private int idUsuario;
    private String username;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private String direccion;
    private double saldo;
    private boolean premium;

    public Usuario(int idUsuario, String username, String nombres, String apellidos, String email, String password, String direccion, double saldo, boolean premium) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.saldo = saldo;
        this.premium = premium;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", username=" + username + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", password=" + password + ", direccion=" + direccion + ", saldo=" + saldo + ", premium=" + premium + '}';
    }    
    
}
