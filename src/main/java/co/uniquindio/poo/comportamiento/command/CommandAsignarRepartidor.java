package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.comportamiento.memento.MementoPedido;
import co.uniquindio.poo.comportamiento.strategy.ContextAsignacion;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class CommandAsignarRepartidor implements CommandPedido {
    private PedidoBase pedido;
    private String usuario;
    private ContextAsignacion context;
    private MementoPedido memento;

    public CommandAsignarRepartidor(PedidoBase pedido, String usuario, ContextAsignacion context) {
        this.pedido = pedido;
        this.usuario = usuario;
        this.context = context;
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

    public ContextAsignacion getContext() {
        return context;
    }

    public void setContext(ContextAsignacion context) {
        this.context = context;
    }

    public MementoPedido getMemento() {
        return memento;
    }

    public void setMemento(MementoPedido memento) {
        this.memento = memento;
    }


}
