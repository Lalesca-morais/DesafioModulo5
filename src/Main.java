import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();
        Produtos produto = new Produtos();
        Cliente cliente = new Cliente();
        Vendas venda = new Vendas();

        System.out.println("==========MENU DE OPÇÕES==========");
        System.out.println("Digite a opção desejada!");
        System.out.println("1 - Cadastrar cliente ");
        System.out.println("2 - Cadastrar vendedor");
        System.out.println("3 - Cadastrar venda e realizar compra");
        System.out.println("4 - ");
        System.out.println("5 - Listar vendas cadastradas");
        System.out.println("6 - Listar vendedores cadastrados");
        System.out.println("7 - Listar clientes cadastrados");
        System.out.println("8 - Sair");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                Cliente.cadastroCliente();
                break;
            case 2:
                Vendedor.cadastrarVendedor();
                break;
            case 3:
                venda.cadastrarVendas();
                break;
            case 4:

                break;
            case 5:
                for (Vendas lista: vendasCadastradas) {
                    System.out.println(vendasCadastradas);
                }
            case 6:
                for (String lista: listaVendedores) {
                    System.out.println(listaVendedores);
                }
            case 7:
                for (Cliente lista: cadastroCliente) {
                    System.out.println(cadastroCliente);
                }
            case 8:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
