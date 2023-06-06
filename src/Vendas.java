import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Vendas extends Produtos {
    private String cliente, vendedorResponsavel, valorASerPago, produto;
    private int quantProduto;
    private LocalDate dataRegistro;
    public Vendas() {

    }
    public Vendas(String cliente, String vendedorResponsavel, String valorASerPago, LocalDate dataRegistro, String produto, int quantProduto) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorASerPago = valorASerPago;
        this.dataRegistro = dataRegistro;
        this.produto = produto;
        this.quantProduto = quantProduto;
    }
    public String getCliente() {
        return cliente;
    }
    public String getVendedorResponsavel() {
        return vendedorResponsavel;
    }
    public String getValorASerPago() {
        return valorASerPago;
    }
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setVendedorResponsavel(String vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }
    public void setValorASerPago(String valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void cadastrarVendas() {
        Scanner entrada = new Scanner(System.in);
        Produtos produtos = new Produtos();
        Set<Vendas> vendasCadastradas = new HashSet<>();

        //identificacao do cliente e solicitacao do cpf
        //chamar a lista de clientes e verificar se existe esse cpf

        System.out.println("----- Cadastro de Vendas -----");
        String produto = Produtos.menu();

        System.out.println("Digite o valor: ");
        double valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantProduto = entrada.nextInt();

        vendasCadastradas.add(new Vendas(cliente, vendedorResponsavel, valorASerPago, dataRegistro, produto, quantProduto));

    }
}

