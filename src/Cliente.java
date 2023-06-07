import java.util.Scanner;
public class Cliente {
    private String nome, email;
    private String cpf;
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
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