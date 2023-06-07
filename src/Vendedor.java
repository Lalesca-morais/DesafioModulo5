import java.util.Scanner;
public class Vendedor {
    private String nome, email;
    private String cpf;

    public Vendedor(String nome, String email, String cpf) {
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

