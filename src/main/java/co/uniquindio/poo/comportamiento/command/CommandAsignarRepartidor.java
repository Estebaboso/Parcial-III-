package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.comportamiento.memento.MementoPedido;
import co.uniquindio.poo.comportamiento.strategy.ContextAsignacion;
import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

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
        memento = pedido.createMemento();   // "foto" antes de asignar
        Repartidor repartidor = context.asignar(pedido);   // aquí se pone a hacer vueltas el Strategy
        if (repartidor == null) {
            System.out.println("Command: No hay repartidores disponibles para el pedido " + pedido.getId());
            return;
        }
        pedido.setRepartidor(repartidor);
        System.out.println("Command: " + usuario + " asignó a " + repartidor.getNombre()
                + " al pedido " + pedido.getId());
    }

    @Override
    public void deshacer() {
        Repartidor asignado = pedido.getRepartidor();
        if (memento != null) {
            pedido.restoreMemento(memento);   // vuelve al repartidor anterior (o a ninguno)
        }
                          // Solo si ContextAsignacion.asignar() le sumó el pedido al repartidor:
        if (asignado != null) {
            asignado.setPedidosActivos(Math.max(0, asignado.getPedidosActivos() - 1));
        }
    }

    @Override
    public String getDescripcion() {
        return "Asignar repartidor al pedido " + pedido.getId();
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
