
package lojadeeletronicos;


    class Celular extends Eletronico {
  
    private double tela;

    public Celular(String marca) {
        super(marca);
    }

    public void definirTela(double tamanho) {
        this.tela = tamanho;
    }

    public void definirTela(int tamanho) {
        this.tela = tamanho;
    }

    @Override
    public void ligar() {
        System.out.println("O celular da marca " + marca + " está ligando.");
    }  
   public double getTela() {
        


