package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class CommandAceptarPedido implements CommandPedido {
    private PedidoBase pedido;
    private String usuario;

    public CommandAceptarPedido(PedidoBase pedido, String usuario) {
        this.pedido = pedido;
        this.usuario = usuario;
    }

    public PedidoBase getPedido() {
        return pedido;
    }

    public void setPedido(PedidoBase pedido) {
        this.pedido = pedido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {

    }

    @Override
    public void deshacer() {

    }

    @Override
    public String getDescripcion() {

        return "";
    }
}
