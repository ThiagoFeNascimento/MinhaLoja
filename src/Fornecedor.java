import java.util.List;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private List<Produto> produtosDisponiveis;

    // Construtor completo
    public Fornecedor(String nome, String cnpj, String telefone, String email, List<Produto> produtosDisponiveis) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.produtosDisponiveis = produtosDisponiveis != null ? produtosDisponiveis : List.of(); // Inicializa uma lista vazia se for null
    }

    // Construtor com nome e CNPJ apenas
    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = "";
        this.email = "";
        this.produtosDisponiveis = List.of(); // Inicializa uma lista vazia
    }

    // Construtor vazio
    public Fornecedor() {
        this.nome = "";
        this.cnpj = "";
        this.telefone = "";
        this.email = "";
        this.produtosDisponiveis = List.of(); // Inicializa uma lista vazia
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Produto> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void setProdutosDisponiveis(List<Produto> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis != null ? produtosDisponiveis : List.of(); // Verifica se a lista é null e inicializa uma lista vazia
    }

    // Método para adicionar um produto à lista de produtos disponíveis
    public void adicionarProduto(Produto produto) {
        produtosDisponiveis.add(produto);
    }

    // Método para remover um produto da lista de produtos disponíveis
    public void removerProduto(Produto produto) {
        produtosDisponiveis.remove(produto);
    }
}
