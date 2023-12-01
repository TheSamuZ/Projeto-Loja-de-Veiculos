//classe chamada "Carro" que estende a classe "Veiculos"
public class Carro extends Veiculos {
    // O método "getTipodeCombustivel()" retorna o valor da propriedade "TipodeCombustivel"
    public String getTipodeCombustivel() {
        return TipodeCombustivel;
    }
    //O método "setTipodeCombustivel()" recebe um valor como parâmetro e
    // atribui esse valor à propriedade "TipodeCombustivel"
    public void setTipodeCombustivel(String tipodeCombustivel) {
        TipodeCombustivel = tipodeCombustivel;
    }

    //possui um método "toString()" que retorna uma representação em string do objeto.
    // Esse método utiliza o método "toString()" da classe "Veiculos" e
    // depois concatena o tipo de combustível do carro.
    @Override
    public String toString() {
        String toStringHeranca = super.toString();
        return toStringHeranca + "Tipo de combustível: " + TipodeCombustivel + "\n";
    }
    //Esse construtor usa o construtor da classe  "Veiculos" para
    // inicializar os atributos da classe pai e, em seguida,atribui o tipo de combustível passado
    // como parâmetro para o atributo "TipodeCombustivel" da classe Carro.

    private String TipodeCombustivel;
//a classe possui um construtor que recebe como parâmetros
// a marca, modelo, preço e tipo de combustível do carro.
    public Carro(String marca, String modelo, double preco, String tipodeCombustivel) {
        super(marca, modelo, preco);
        TipodeCombustivel = tipodeCombustivel;
    }
}
