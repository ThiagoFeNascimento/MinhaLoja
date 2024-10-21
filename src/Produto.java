import java.util.Map;

public class Produto extends ProdutoEletronico {
    private String categoria;
    private int estoque;
    private String descricao;
    private Map<String, String> especificacoes; // Detalhes técnicos
    private int garantia;

    // Construtor completo
    public Produto(String nome, String marca, String modelo, double preco, String categoria, int estoque, String descricao, Map<String, String> especificacoes, int garantia) {
        super(nome, marca, modelo, preco); // Chamada ao construtor da superclasse
        this.categoria = categoria;
        this.estoque = estoque;
        this.descricao = descricao;
        this.especificacoes = especificacoes;
        this.garantia = garantia;
    }

    // Construtor com nome e preço (usa o construtor da superclasse)
    public Produto(String nome, double preco) {
        super(nome, preco); // Chamada ao construtor da superclasse
    }

    // Getters e Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Map<String, String> getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(Map<String, String> especificacoes) {
        this.especificacoes = especificacoes;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
