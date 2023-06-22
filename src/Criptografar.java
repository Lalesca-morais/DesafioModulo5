import org.mindrot.jbcrypt.BCrypt;
import src.main.SenhaCliente;
import java.util.ArrayList;
import java.util.List;
public class Criptografar {
    SenhaCliente senhaCliente = new SenhaCliente();
    List<Cliente> clientes = new ArrayList<Cliente>();
    public void criptografarSenha(Cliente Cliente) {
     String senhaCriptografada = BCrypt.hashpw(senhaCliente.getSenha(), BCrypt.gensalt());
     senhaCliente.setSenha(senhaCriptografada);
    }
    public void adicionarCliente(Cliente cliente) {
        criptografarSenha(cliente);
        clientes.add(cliente);
    }
    public String mostrarSenha() {return clientes.get(0).getSenha();}
    public boolean login(String senha){return BCrypt.checkpw(senha, clientes.get(0).getSenha());}
}
