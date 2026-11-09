package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.comportamiento.memento.MementoPedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class CommandCancelarPedido implements CommandPedido {
    private PedidoBase pedido;
    private String usuario;
    private String motivo;
    private MementoPedido memento;

    public CommandCancelarPedido(PedidoBase pedido, String usuario, String motivo) {
        this.pedido = pedido;
        this.usuario = usuario;
        this.motivo = motivo;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public MementoPedido getMemento() {
        return memento;
    }

    public void setMemento(MementoPedido memento) {
        this.memento = memento;
    }

}
