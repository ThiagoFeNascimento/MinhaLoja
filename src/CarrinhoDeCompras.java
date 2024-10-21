import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private Map<Produto, Integer> produtos; // Produto e quantidade
    private double total;

    // Construtor completo
    public CarrinhoDeCompras(Cliente cliente, Map<Produto, Integer> produtos, double total) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
    }

    // Construtor com apenas o cliente
    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new HashMap<>();
        this.total = 0.0;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Produto, Integer> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
