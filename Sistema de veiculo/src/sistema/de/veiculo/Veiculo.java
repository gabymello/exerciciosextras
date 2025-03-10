
package sistema.de.veiculo;


    abstract class Veiculo {
    // Atributos
    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos abstratos
    public abstract void exibirDetalhes();

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    // Atributos específicos da classe Carro
    private int portas;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int portas, int ano) {
        super(marca, modelo);
        this.portas = portas;
        this.ano = ano;
    }

    // Sobrecarga do método definir detalhes com parâmetros int
    public void definirDetalhes(int portas, int ano) {
        this.portas = portas;
        this.ano = ano;
    }

    // Sobrecarga do método definir detalhes com parâmetros String
    public void definirDetalhes(String detalhes) {
        String[] partes = detalhes.split(",");
        this.portas = Integer.parseInt(partes[0].trim());
        this.ano = Integer.parseInt(partes[1].trim());
    }

    // Sobrescreve o método exibirDetalhes da classe abstrata Veiculo
    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo());
        System.out.println("Portas: " + portas);
        System.out.println("Ano: " + ano);
    }
}

    
    
}
