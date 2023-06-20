import java.time.LocalDate;
import java.util.*;
public class Metodos {
    private Set<Cliente> clientes = new HashSet<>();
    private Set<Vendas> vendasCadastradas = new HashSet<>();
    private Set<Vendedor> vendedor = new HashSet<>();
    private ArrayList<Produtos> listaProdutos = new ArrayList<>();
    public Set<Vendas> getVendasCadastradas() {
        return vendasCadastradas;
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public Set<Vendedor> getVendedor() {
        return vendedor;
    }
    public void setVendasCadastradas(Set<Vendas> vendasCadastradas) {this.vendasCadastradas = vendasCadastradas;}
    public void setClientes(Set<Cliente> clientes) {this.clientes = clientes;}
    public void setVendedor(Set<Vendedor> vendedor) {this.vendedor = vendedor;}
    public void setListaProdutos(ArrayList<Produtos> listaProdutos) {this.listaProdutos = listaProdutos;}
    public void setEntrada(Scanner entrada) {this.entrada = entrada;}
    Scanner entrada = new Scanner(System.in);
    public void cadastroCliente() {
        String nome, cpf;
        try {
            while (true) {

                System.out.println("Para cadastrar, informe seu nome: ");
                nome = entrada.nextLine();
                System.out.println();

                System.out.println("Informe seu CPF:");
                cpf = entrada.nextLine();

                if (!clientes.contains(cpf)) {
                    System.out.println("CPF validado!");
                } else {
                    System.out.println("Cliente não cadastrado pois o CPF já existe.");
                }
                System.out.println("Digite o seu e-mail: ");
                String email = entrada.nextLine();

                if (!email.contains("@")) {
                    System.out.println("Cliente não cadastrado pois o e-mail é inválido.");
                } else {
                    Cliente cliente1 = new Cliente(nome, cpf, email);
                    clientes.add(cliente1);
                    System.out.println("Cliente cadastrado com sucesso!");
                }
                break;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida" + exception.getMessage());
        } catch (IllegalArgumentException | UnsupportedOperationException exception) {
            System.out.println("Entrada não permitida/suportada " + exception.getMessage());
        }
    }
    public void cadastrarVendedor() {
        try {
            String nome, cpf;

            System.out.println("Para cadastrar, informe seu nome: ");
            nome = entrada.nextLine();
            System.out.println();

            System.out.println("Informe seu CPF:");
            cpf = entrada.nextLine();

            if (!vendedor.contains(cpf)) {
                System.out.println("CPF validado!");
            } else {
                System.out.println("Vendedor não cadastrado pois o CPF já existe.");
            }
            System.out.println("Digite o seu e-mail: ");
            String email = entrada.nextLine();

            if (!email.contains("@")) {
                vendedor.add(new Vendedor(nome, cpf, email));
                System.out.println("Vendedor cadastrado com sucesso!");
            } else {
                System.out.println("Vendedor não cadastrado pois o e-mail é inválido.");
            }
            System.out.println();
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida" + exception.getMessage());
        } catch (IllegalArgumentException | UnsupportedOperationException exception) {
            System.out.println("Entrada não permitida/suportada " + exception.getMessage());
        }
    }
    public void menu() {
        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produtos(1, "Banana", 1.99));
        listaProdutos.add(new Produtos(2, "Uva", 2.99));
        listaProdutos.add(new Produtos(3, "Morango", 3.99));
        listaProdutos.add(new Produtos(4, "kiwi", 4.99));
        listaProdutos.add(new Produtos(5, "Mamão", 5.99));
        listaProdutos.add(new Produtos(6, "Melancia", 6.99));

        System.out.println("-----Produtos á venda na loja-----");
        for (Produtos lista : listaProdutos) {
            System.out.println("Codigo:" + lista.getCodigoProduto() + "\nProduto:" + lista.getNomeProduto() + "\nPreço:" + lista.getPrecoProduto());
            System.out.println("=====================================");
        }
    }
        public void cadastrarVendas () {
            LocalDate data = LocalDate.now();

            System.out.println("----- Cadastro de Vendas -----");
            System.out.println("Digite o nome do cliente para cadastrar a venda: ");
            String nome = entrada.nextLine();

            System.out.println("Informe seu CPF:");
            String cpf = entrada.nextLine();

            int existeCpf = 0;

            for(Cliente cliente : clientes) {
                if (cliente.getCpf().contains(cpf)) {
                    existeCpf++;
                    System.out.println("CPF não validado pois já existe na lista");
                }
            }if (existeCpf == 0) {
                System.out.println("CPF validado!");
            }
            System.out.println();

            System.out.println("Digite a quantidade: ");
            int quantProduto = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite o CPF do vendedor responsável");
            cpf = entrada.nextLine();

            System.out.println("Digite o nome do produto: ");
            String nomeProduto = entrada.nextLine();

            System.out.println("Digite o código do produto: ");
            int codigoProduto = entrada.nextInt();

           //vendasCadastradas.add(new Vendas(nome, cpf,quantProduto, codigoProduto));
        }
        public void buscarVendas () {

            if (vendasCadastradas.isEmpty()) {
                System.out.println("Não existem vendas cadastradas");
            } else {
                System.out.println("Histórico de vendas: ");

                for (Vendas venda : vendasCadastradas) {
                    int cont = 0;
                    System.out.println("Código: " + venda.getCodigoProduto());
                    System.out.println("Nome: " + venda.getNomeProduto());
                    System.out.println("Preço: " + venda.getPreco());
                    System.out.println("Quantidade: " + venda.getQuantProduto());
                    System.out.println("Data: " + venda.getDataRegistro());
                    System.out.println("Valor total: " + venda.getValorTotal());
                    System.out.println("Vendedor responsável: " + venda.getVendedorResponsavel());
                    System.out.println("Cliente: " + venda.getCliente());
                    cont++;
                }
            }
        }
        public void buscarVendedores () {
            if (vendedor.isEmpty()) {
                System.out.println("Vendedor não encontrado");
            } else {
                System.out.println("Vendedores disponíveis");
                for (Vendedor vendedor : vendedor) {
                    int cont = 0;
                    System.out.println("Vendedor: " + cont);
                    System.out.println("CPF: " + vendedor.getCpf());
                    System.out.println("E-mail: " + vendedor.getEmail());
                    System.out.println("Nome: " + vendedor.getNome());
                }
            }
        }

        public void buscarCliente () {
            if (clientes.isEmpty()) {
                System.out.println("Cliente não encontrado");
            } else {
                System.out.println("Clientes disponíveis");
                int cont = 0;
                for (Cliente cliente : clientes) {
                    cont++;
                    System.out.println("Cliente: " + cont);
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("E-mail: " + cliente.getEmail());
                    System.out.println("Nome: " + cliente.getNome());
                }
            }
        }
        public void compraPeloCliente () {
            System.out.println("Insira o cpf do cliente: ");
            String cpfCliente = entrada.nextLine();

            for (Cliente cliente : clientes) {
                if (cliente.getCpf().contains(cpfCliente)) {
                    for (Vendas vendas : vendasCadastradas) {
                        System.out.println("Compras realizadas pelo cliente: ");

                        System.out.println("Código: " + vendas.getCodigoProduto());
                        System.out.println("Produto: " + vendas.getNomeProduto());
                        System.out.println("Preço: " + vendas.getPreco());
                        System.out.println("Quantidade: " + vendas.getQuantProduto());
                        System.out.println("Valor total: " + vendas.getValorTotal());
                    }
                }else {
                    System.out.println("Cpf inválido/Cliente não encontrado");
                }
            }
        }
        public void vendasPorVendedor () {
            System.out.println("Insira o e-mail do vendedor: ");
            String emailVendedor = entrada.nextLine();

            for (Vendedor vendedor : vendedor) {
                if (vendedor.getEmail().contains(emailVendedor)) {
                    for (Vendas vendas : vendasCadastradas) {
                        System.out.println("Vendas realizadas pelo vendedor: ");

                        System.out.println("Código: " + vendas.getCodigoProduto());
                        System.out.println("Produto: " + vendas.getNomeProduto());
                        System.out.println("Preço: " + vendas.getPreco());
                        System.out.println("Quantidade: " + vendas.getQuantProduto());
                        System.out.println("Valor total: " + vendas.getValorTotal());
                    }
                }else {
                    System.out.println("E-mail inválido/Vendedor não encontrado");
                }
            }
        }
}


