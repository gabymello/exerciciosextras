
package sistema.de.conta.bancaria;


    class ContaPoupanca extends Conta {
    private double taxaRendimento;  // Atributo taxa de rendimento com visibilidade privada

    public ContaPoupanca(double saldo, double taxaRendimento) {
        super(saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Sobrecarga do método definirTaxa para aceitar um valor inteiro
    public void definirTaxa(int taxa) {
        this.taxaRendimento = taxa / 100.0;
    }

    // Sobrecarga do método definirTaxa para aceitar um valor decimal (double)
    public void definirTaxa(double taxa) {
        this.taxaRendimento = taxa;
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * taxaRendimento;
        System.out.println("Novo saldo após juros (Conta Poupança): " + saldo);
    }
}


