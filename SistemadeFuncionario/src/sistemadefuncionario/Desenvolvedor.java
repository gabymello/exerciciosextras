
package sistemadefuncionario;




class Desenvolvedor extends Funcionario {

    private int horasTrabalhadas;

    public Desenvolvedor(String nome, int horasTrabalhadas) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void definirHorasTrabalhadas(int horas) {
        this.horasTrabalhadas = horas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * 50;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + ", Salário: R$" + calcularSalario();
    }
}

