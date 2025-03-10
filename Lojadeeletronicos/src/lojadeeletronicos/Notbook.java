
package lojadeeletronicos;





    class Notebook extends Eletronico {
   
    private int ram;

   
    public Notebook(String marca) {
        super(marca);
    }

    public void definirRam(int ram) {
        this.ram = ram;
    }

   
    @Override
    public void ligar() {
        System.out.println("O notebook da marca " + marca + " está ligando.");
    }

    
    public int getRam() {
        return ram;
    }
}

