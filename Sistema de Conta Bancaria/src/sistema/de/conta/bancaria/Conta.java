
package sistema.de.conta.bancaria;


  abstract class Conta {
    protected double saldo;  // Atributo saldo com visibilidade protegida

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // Método abstrato que deverá ser implementado pelas subclasses
    public abstract void calcularJuros();
}

    
    

