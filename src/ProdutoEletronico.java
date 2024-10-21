public class ProdutoEletronico {
    private String nome;
    private String marca;
    private String modelo;
    private double preco;

    // Construtor com todos os atributos
    public ProdutoEletronico(String nome, String marca, String modelo, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    // Construtor com apenas nome e preco
    public ProdutoEletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
