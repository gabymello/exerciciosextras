
package sistema.de.conta.bancaria;


public class SistemaDeContaBancaria {

    
    public static void main(String[] args) {
     
        // Criando uma ContaPoupanca
        ContaPoupanca cp = new ContaPoupanca(100.0, 0.05);  // Inicializando com 5% de taxa de rendimento
        cp.calcularJuros();  // Calculando juros para Conta Poupança
        
        // Sobrecarga de método: Definindo nova taxa de rendimento com int
        cp.definirTaxa(6);  // Nova taxa de 7%
        cp.calcularJuros();  // Calculando juros novamente
        
        // Criando uma ContaCorrente
        ContaCorrente cc = new ContaCorrente(2020.0, 550.0);  // Inicializando com saldo de 2000 e limite de 500
        cc.calcularJuros();  // Calculando juros para Conta Corrente
        
        // Alterando limite da Conta Corrente
        cc.definirLimite(1200.0);
        System.out.println("Novo limite da Conta Corrente: " + cc.limite);
    }
}

        
        
        
    
    

