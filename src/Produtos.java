import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Produtos {
    public static String menu() {

        String itemComprado;

        Scanner entrada = new Scanner(System.in);
        Map<String, String> loja = new HashMap<>();

        loja.put("Item 1 -","Maça");
        loja.put("Item 2 -","Banana");
        loja.put("Item 3 -", "Melancia");
        loja.put("Item 4 -", "Melao");
        loja.put("Item 5 -", "Uva");
        loja.put("Item 6 -", "Morango");
        loja.put("Item 7 -", "Alho-poró");
        loja.put("Item 8 -", "Brócolis");
        loja.put("Item 9 -", "Coentro");
        loja.put("Item 10 -", "Mostarda");
        loja.put("Item 11 -", "Erva-doce");
        loja.put("Item 12 -", "Espinafre");

        for (int i = 0; i < loja.size(); i++) {
            System.out.println(loja.get(i));
        }
        System.out.println("Digite o item que deseja comprar: ");
        int item = entrada.nextInt();

        itemComprado = loja.get(item-1);

        System.out.println("Item adicionado ao carrinho com sucesso!");

        return itemComprado;
    }
}
