import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando a loja
        Loja loja = new Loja();

        // Criando os veículos
        Map<String, Veiculos> veiculos = new HashMap<>();
        veiculos.put("fit", new Carro("Fiat", "Palio", 25000, "Flex"));
        veiculos.put("onix", new Carro("Volkswagen", "Gol", 30000, "Gasolina"));
        veiculos.put("fazer", new Moto("Honda", "CB 500", 35000, "Esportivo"));
        veiculos.put("factor", new Moto("Yamaha", "YZF-R3", 40000, "Naked"));


        // Adicionando os veículos à loja
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o veículo que deseja adicionar: ");
        Veiculos veiculoAdicionado = veiculos.get(sc.nextLine());
        loja.adicionarVeiculos(veiculoAdicionado);

        // Listando os veículos da loja
        System.out.println("Veículos disponíveis na loja:");
        loja.listarVeiculos();

        // Calculando o valor total do estoque
        double valorTotal = loja.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: R$" + valorTotal);
    }
}