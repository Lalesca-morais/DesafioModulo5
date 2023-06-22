import java.util.Scanner;
public class Cliente {
    private String nome, email, cpf, senha;
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
}