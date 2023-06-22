import org.junit.Test;  
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;
public class MetodosTest {
    Metodos metodos = new Metodos();
    @Test
    public void naoDeveriaMostrarSeBuscaVendas() {
        metodos.buscarVendas();
        assertEquals(metodos.getVendasCadastradas(),Collections.emptySet());
    }
    @Test
    public void deveriaMostrarSeBuscaVendas() {
        Cliente cliente = new Cliente("Joao", "joao@gmail.com", "123");
        Vendas venda = new Vendas();
        Set<Vendas> vendasCadastradas = new HashSet<>();
        vendasCadastradas.add(venda);
        metodos.setVendasCadastradas(vendasCadastradas);
        metodos.buscarVendas();
       assertEquals(metodos.getVendasCadastradas().size(), 1);
    }
    @Test
    public void naoDeveriaBuscarVendedores() {
        metodos.buscarVendedores();
        assertEquals(metodos.getVendedor(), Collections.emptySet());
    }
    @Test
    public void deveriaMostrarVendedorCadastrado() {
        Set<Vendedor> vendedor = new HashSet<>();
        Vendedor vendedor1 = new Vendedor("Luiz", "luiz@gmail.com", "1234");
        vendedor.add(vendedor1);
        metodos.setVendedor(vendedor);
        metodos.buscarVendedores();
        assertEquals(metodos.getVendedor().size(), 1);
    }
    @Test
    public void naoDeveriaMostrarCliente() {
        metodos.buscarCliente();
        assertEquals(metodos.getClientes(), Collections.emptySet()); // retorna um conjunto vazio
    }
    @Test
    public void deveriaMostrarClienteCadastrado() {
        Set<Cliente> clientes = new HashSet<>();
        Cliente cliente1 = new Cliente("Maria", "maria@gmail.com", "6475");
        clientes.add(cliente1);
        metodos.setClientes(clientes);
        metodos.buscarCliente();
        assertEquals(metodos.getClientes().size(), 1);
    }
}




