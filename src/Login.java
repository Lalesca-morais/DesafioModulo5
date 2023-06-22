import src.main.SenhaCliente;
import java.util.Scanner;
public class Login {
    SenhaCliente senhaCliente = new SenhaCliente();
    Scanner entrada = new Scanner(System.in);
    Criptografar criptografar = new Criptografar();
    public void login() {
        System.out.println("===LOGIN===");
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = entrada.nextLine();

        if(criptografar.login(senha)) {
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Senha incorreta!");
        }
    }
    public void cadastroCliente(Cliente cliente){
        criptografar.adicionarCliente(cliente);
        System.out.println("Senha criptografada: " + criptografar.mostrarSenha());
    }
}
