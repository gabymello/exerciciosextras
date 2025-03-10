
package sistemadeveiculo;



   class Moto extends Veiculo {

    protected int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void definirDetalhes(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + marca + " " + getModelo() + ", " + cilindradas + " cilindradas");
}
} 

