
package sistemadeveiculo;

 class Carro extends Veiculo {

    protected int portas;
    private int ano;

    public Carro(String marca, String modelo, int portas, int ano) {
        super(marca, modelo);
        this.portas = portas;
        this.ano = ano;
    }

    public void definirDetalhes(int ano) {
        this.ano = ano;
    }

    public void definirDetalhes(String ano) {
        try {
            this.ano = Integer.parseInt(ano);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Ano inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + getModelo() + ", " + portas + " portas, Ano " + ano);

}
}