import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Metodos metodos = new Metodos();
        Login login = new Login();
        Criptografar criptografar = new Criptografar();
        Set<Cliente> clientes = new HashSet<>();
        while (true) {
            System.out.println("==========MENU DE OPÇÕES==========");
            System.out.println("1 - Cadastrar cliente ");
            System.out.println("2 - Cadastrar vendedor");
            System.out.println("3 - Cadastrar venda");
            System.out.println("4 - Listar vendas cadastradas");
            System.out.println("5 - Listar vendedores cadastrados");
            System.out.println("6 - Listar clientes cadastrados");
            System.out.println("7 - Pesquisar compras do cliente  através de seu CPF");
            System.out.println("8 - Pesquisar vendas de um vendedor através de seu e-mail");
            System.out.println("9 - Mostrar lista de produtos");
            System.out.println("10 - Criar senha criptografada");
            System.out.println("11 - Sair");
            int escolhaCliente = entrada.nextInt();

            switch (escolhaCliente) {
                case 1:
                    metodos.cadastroCliente();
                    break;
                case 2:
                    metodos.cadastrarVendedor();
                    break;
                case 3:
                    metodos.cadastrarVendas();
                    break;
                case 4:
                    for (Vendas lista : metodos.getVendasCadastradas()) {
                        System.out.println(lista);
                    }
                    break;
                case 5:
                    for (Vendedor lista : metodos.getVendedor()) {
                        System.out.println(lista);
                    }
                    break;
                case 6:
                    for (Cliente lista : metodos.getClientes()) {
                        System.out.println(lista);
                    }
                    break;
                case 7:
                    metodos.compraPeloCliente();
                    break;
                case 8:
                    metodos.vendasPorVendedor();
                    break;
                case 9:
                    metodos.menu();
                    break;
                case 10:
                    System.out.println("Informe seu CPF: ");
                    String cpf = entrada.nextLine();
                    entrada.nextLine();

                    Optional<Cliente> cliente = metodos.getClientes().stream().filter(x -> x.getCpf().equals(cpf)).findFirst();
                    if (cliente.isPresent()) {
                        criptografar.criptografarSenha(cliente.get());
                    } else {
                        System.out.println("É necessário realizar o cadastro primeiro!");
                        metodos.cadastroCliente();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            if (escolhaCliente == 11) {
                break;
            }
        }
    }
}

