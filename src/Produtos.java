public class Produtos {
    private int codigoProduto;
    private String nomeProduto;
    private double precoProduto;
    private double totalCompra;
    public Produtos(int codigoProduto, String nomeProduto, double precoProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.totalCompra = totalCompra;
    }
    public int getCodigoProduto() {return codigoProduto;}
    public String getNomeProduto() {return nomeProduto;}
    public double getPrecoProduto() {return precoProduto;}
    public double getTotalCompra() {return totalCompra;}
}
