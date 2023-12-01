import java.util.ArrayList;
import java.util.List;

public class Loja {
    // cria a lista de veículos disponíveis,
    // utilizando a implementação da classe ArrayList da biblioteca java.util
    public List<Veiculos> veiculosDisponiveis = new ArrayList<>();

    //O método "adicionarVeiculos" recebe um objeto do tipo Veiculos como parâmetro e
    // adiciona esse objeto à lista "veiculosDisponiveis" utilizando o método "add"
    // da classe ArrayList.
    public void adicionarVeiculos (Veiculos veiculo){
        veiculosDisponiveis.add(veiculo);
    }
    //O método "removerVeiculo" recebe um objeto do tipo Veiculos como parâmetro e
    // remove esse objeto da lista "veiculosDisponiveis" utilizando o método "remove"
    // da classe ArrayList.
    public void removerVeiculo(Veiculos veiculo) {
        veiculosDisponiveis.remove(veiculo);
    }


//O método "listarVeiculos" adiciona sobre a lista "veiculosDisponiveis" utilizando um
// loop for-each e imprime na tela cada objeto do tipo Veiculos
    public void listarVeiculos() {
        for (Veiculos veiculo : veiculosDisponiveis) {
            System.out.println(veiculo);
        }
    }

    //O método "calcularValorTotalEstoque" itera sobre a lista "veiculosDisponiveis" utilizando um
    // loop for-each e acumula o valor de cada veículo na variável "valorTotal"
    // utilizando o método "getPreco" da classe Veiculos.
    // No final, retorna o valor total do estoque.
    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Veiculos veiculo : veiculosDisponiveis) {
            valorTotal += veiculo.getPreco();
        }
        return valorTotal;
    }

}


