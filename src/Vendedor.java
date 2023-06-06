import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Vendedor {
    public static void cadastrarVendedor() {
        Scanner entrada = new Scanner(System.in);
        Set<String> listaVendedores = new HashSet<>();

        System.out.println("Informe nome do vendedor para cadastro: ");
        String nomeVendedor = entrada.nextLine();
        listaVendedores.add(nomeVendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }
}
