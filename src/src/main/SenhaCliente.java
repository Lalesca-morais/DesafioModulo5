package src.main;
public class SenhaCliente {
    private String email, senha;
    public SenhaCliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public SenhaCliente() {}
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

}
