
package sistemadefuncionario;



   class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double bonus) {
        super(nome);
        this.bonus = bonus;
    }

    public void definirBonus(double bonus) {
        this.bonus = bonus;
    }

    public void definirBonus(int bonus) {
        this.bonus = (double) bonus;
    }

    @Override
    public double calcularSalario() {
        return 5000 + bonus;
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + ", Salário: R$" + calcularSalario();
    }
}
