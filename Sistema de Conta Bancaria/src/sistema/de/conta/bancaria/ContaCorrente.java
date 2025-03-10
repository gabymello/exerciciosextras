
package sistema.de.conta.bancaria;


   class ContaCorrente extends Conta {
    double limite;  // Atributo limite com visibilidade privada

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    // Método para definir o limite da conta
    public void definirLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void calcularJuros() {
        // Não há juros específicos para conta corrente, apenas uma taxa fixa por exemplo
        saldo -= saldo * 0.01;  // Deduzindo uma taxa de 1% do saldo
        System.out.println("Novo saldo após taxa (Conta Corrente): " + saldo);
    }
}
 

