import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
public class Cliente {
    private String nome, email;
    private int cpf;
    public Cliente() {
    }
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    public static boolean validarcpf(int cpf) {
      //  return cpf.
    }
    public static boolean validarEmail(String email){
        return email.contains("@");
    }
    public static void cadastroCliente() {
        Scanner entrada = new Scanner(System.in);

        try {
            while (true) {
                Set<Cliente> clientes = new HashSet<>();

                System.out.println("Para cadastrar, informe seu nome: ");
                String nome = entrada.nextLine();
                System.out.println();

                System.out.println("Informe seu CPF:");
                int cpf = entrada.nextInt();

                if ()

                System.out.print("Digite o seu e-mail: ");
                String email = entrada.nextLine();

                if (validarEmail(email)) {
                    clientes.add(new Cliente(nome, email));
                    System.out.println("Cliente cadastrado com sucesso!");
                } else {
                    System.out.println("E-mail inválido! Cliente não cadastrado.");
                }
                System.out.println();
            }

        } catch(NumberFormatException exception){
            System.out.println("Entrada inválida" + exception.getMessage());
        } catch(IllegalArgumentException | UnsupportedOperationException exception){
            System.out.println("Entrada não permitida/suportada " + exception.getMessage());
        }
    }
}
