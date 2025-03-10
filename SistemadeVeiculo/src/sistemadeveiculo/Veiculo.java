
package sistemadeveiculo;



    abstract class Veiculo {

    protected String marca;
    private final String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void exibirDetalhes();
}

