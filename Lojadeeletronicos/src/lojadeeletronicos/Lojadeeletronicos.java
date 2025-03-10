
package lojadeeletronicos;


public class Lojadeeletronicos {

   
    public static void main(String[] args) {
        Eletronico celular = new Celular("iphone");
        Eletronico notebook = new Notebook("Dell");

       
        celular.ligar();
        notebook.ligar();

        Celular c = (Celular) celular; 
        c.definirTela(6.5);  
        System.out.println("Tamanho da tela do celular: " + c.getTela() + " polegadas");

        c.definirTela(5); 
        System.out.println("Tamanho da tela do celular: " + c.getTela() + " polegadas");

        
        Notebook n = (Notebook) notebook; 
        n.definirRam(16);
        System.out.println("Memória RAM do notebook: " + n.getRam() + " GB");
}
    }
    

