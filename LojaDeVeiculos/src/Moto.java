public class Moto extends Veiculos{
    //A classe Moto tem um construtor que recebe os parâmetros de
    // marca, modelo, preço e tipo de guidão da moto.
    public Moto(String marca, String modelo, double preco, String tipoGuidao) {
        super(marca, modelo, preco);
        TipoGuidao = tipoGuidao;
    }
    // A classe Moto adiciona os métodos getters e setters para o atributo "TipoGuidao".
    // Os métodos getters retornam o valor do atributo, enquanto os setters definem um novo
    // valor para o atributo.
    public String getTipoGuidao() {
        return TipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        TipoGuidao = tipoGuidao;
    }

    // O toString() que retorna uma string com as informações da classe
    // "Veiculos" e o tipo de guidão da moto.
    @Override
    public String toString() {
        String toStringHeranca = super.toString();
        return toStringHeranca + "Tipo de guidão: " + TipoGuidao + "\n";
    }

    private String TipoGuidao;
}
