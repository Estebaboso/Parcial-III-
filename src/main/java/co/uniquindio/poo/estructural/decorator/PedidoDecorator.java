package co.uniquindio.poo.estructural.decorator;

public abstract class PedidoDecorator implements Pedido {
    private Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }


}
