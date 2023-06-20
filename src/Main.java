import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Metodos metodos = new Metodos();

            while(true) {
            System.out.println("==========MENU DE OPÇÕES==========");
            System.out.println("Digite a opção desejada!");
            System.out.println("1 - Cadastrar cliente ");
            System.out.println("2 - Cadastrar vendedor");
            System.out.println("3 - Cadastrar venda");
            System.out.println("4 - Listar vendas cadastradas");
            System.out.println("5 - Listar vendedores cadastrados");
            System.out.println("6 - Listar clientes cadastrados");
            System.out.println("7 - Pesquisar compras do cliente  através de seu CPF");
            System.out.println("8 - Pesquisar vendas de um vendedor através de seu e-mail");
            System.out.println("9 - Mostrar lista de produtos");
            System.out.println("10 - Sair");
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
                    break;
                case 10:
                    metodos.menu();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            if (escolhaCliente == 9) {
                break;
            }
        }
    }
}
