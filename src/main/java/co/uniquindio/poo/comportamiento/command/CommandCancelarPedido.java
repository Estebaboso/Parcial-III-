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
        memento = pedido.createMemento();   // "foto" antes de cancelar
        pedido.cancelar();
        System.out.println("Command " + usuario + " canceló el pedido " + pedido.getId() + " (" + motivo + ")");
    }

    @Override
    public void deshacer() {
        if (memento != null) {
            pedido.restoreMemento(memento);
        }
    }

    @Override
    public String getDescripcion() {
        return "Cancelar pedido " + pedido.getId() + " (" + motivo + ")";
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
