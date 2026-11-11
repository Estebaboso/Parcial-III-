package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.comportamiento.memento.MementoPedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class CommandAceptarPedido implements CommandPedido {
    private PedidoBase pedido;
    private String usuario;
    private MementoPedido memento;

    public CommandAceptarPedido(PedidoBase pedido, String usuario) {
        this.pedido = pedido;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        memento = pedido.createMemento();   // "foto" antes de cambiar nada
        pedido.aceptar();
        System.out.println("Command " + usuario + " aceptó el pedido " + pedido.getId());
    }


    @Override
    public void deshacer() {
        if (memento != null) {
            pedido.restoreMemento(memento);
        }
    }

    @Override
    public String getDescripcion() {
        return "Aceptar pedido " + pedido.getId();
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


}
