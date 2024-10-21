import java.time.LocalDateTime;

public class Pagamento {
    private String tipo; // "Cartão de Crédito", "Boleto", "Pix"
    private String status; // "Aprovado", "Pendente", "Rejeitado"
    private double valor;
    private LocalDateTime data;
    private Pedido pedido;

    public Pagamento(String tipo, String status, double valor, LocalDateTime data, Pedido pedido) {
        this.tipo = tipo;
        this.status = status;
        this.valor = valor;
        this.data = data;
        this.pedido = pedido;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}