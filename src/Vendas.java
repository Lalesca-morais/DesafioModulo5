import java.time.LocalDate;
public class Vendas {
    private String vendedorResponsavel, nomeProduto;
    private LocalDate dataAtual;
    private Cliente cliente;
    private int quantProduto, codigoProduto;
    private LocalDate dataRegistro;
    private double valorTotal, preco;

    public Vendas(String nome, String vendedorResponsavel, String nomeProduto,int  quantProduto, int codigoProduto, LocalDate data) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.dataRegistro = dataRegistro;
        this.nomeProduto = nomeProduto;
        this.quantProduto = quantProduto;
        this.preco = preco;
        this.valorTotal = preco * quantProduto;
        this.codigoProduto = codigoProduto;
        this.dataAtual = dataAtual;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public String getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getPreco() {
        return preco;
    }
}

