import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDateTime data;
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;
    private String status;

    // Construtor completo
    public Pedido(int id, LocalDateTime data, Cliente cliente, List<Produto> produtos, double total, String status) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
        this.status = status;
    }

    // Construtor com id, data e cliente
    public Pedido(int id, LocalDateTime data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
