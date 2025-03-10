
package sistemadefuncionario;


public class SistemadeFuncionario {

    public static void main(String[] args) {
         Gerente gerente = new Gerente("Carlos", 1200);
        Desenvolvedor dev = new Desenvolvedor("Ana", 1600);

        System.out.println(gerente);
        System.out.println(dev);

        gerente.definirBonus(1500);
        System.out.println(gerente);

        dev.definirHorasTrabalhadas(180);
        System.out.println(dev);
}
        
        
    }
    

