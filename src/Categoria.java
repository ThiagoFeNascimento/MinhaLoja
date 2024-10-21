import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private String descricao;
    private List<Produto> produtos;

    // Construtor completo
    public Categoria(String nome, String descricao, List<Produto> produtos) {
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos != null ? produtos : new ArrayList<>(); // Inicializa lista vazia se for null
    }

    // Construtor com apenas o nome da categoria
    public Categoria(String nome) {
        this.nome = nome;
        this.descricao = "";
        this.produtos = new ArrayList<>(); // Inicializa lista vazia
    }

    // Construtor vazio
    public Categoria() {
        this.nome = "";
        this.descricao = "";
        this.produtos = new ArrayList<>(); // Inicializa lista vazia
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos != null ? produtos : new ArrayList<>(); // Verifica se a lista é null e inicializa uma lista vazia
    }

    // Método para adicionar um produto à categoria
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para remover um produto da categoria
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
}
