public class Veiculos {
    //"getMarca()": retorna a marca do veículo.
    public String getMarca() {
        return marca;
    }
    //"setMarca(String marca)": permite definir a marca do veículo.
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //"getModelo()": retorna o modelo do veículo.
    public String getModelo() {
        return modelo;
    }
    //"setModelo(String modelo)": permite definir o modelo do veículo.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //"getPreco()": retorna o preço do veículo.
    public double getPreco() {
        return preco;
    }
    //"setPreco(double preco)": permite definir o preço do veículo.
    public void setPreco(double preco) {
        this.preco = preco;
    }


    //possui um construtor que recebe a marca, o modelo e o preço do veículo e
    // atribui esses valores às variáveis de instância correspondentes.
    public Veiculos(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    //"marca": armazena a marca do veículo
    private String marca;
    //"modelo": armazena o modelo do veículo.
    private String modelo;
    //"preco": armazena o preço do veículo.
    private double preco;

    //a classe possui um método "toString()" que retorna uma representação em formato de String dos
    // atributos do veículo (marca, modelo e preço)

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Preco: " + preco + "\n";
    }
}
