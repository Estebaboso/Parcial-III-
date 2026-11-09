package co.uniquindio.poo.estructural.decorator;

public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedidoBasico;

    public PedidoDecorator(Pedido pedidoBasico) {
        this.pedidoBasico = pedidoBasico;
    }


    @Override
    public double getCosto() {
        return pedidoBasico.getCosto();
    }

    @Override
    public String getDescripcion() {
        return pedidoBasico.getDescripcion();
    }

    public Pedido getPedido() {
        return pedidoBasico;
    }

    public void setPedido(Pedido pedido) {
        this.pedidoBasico = pedido;
    }


}
