package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.comportamiento.strategy.ContextAsignacion;
import co.uniquindio.poo.model.Repartidor;

public class MediatorDespacho extends MediatorBase {

    private ContextAsignacion contextAsignacion;

    public MediatorDespacho(ContextAsignacion contextAsignacion) {
        this.contextAsignacion = contextAsignacion;
    }

    public ContextAsignacion getContextAsignacion() {
        return contextAsignacion;
    }

    public void setContextAsignacion(ContextAsignacion contextAsignacion) {
        this.contextAsignacion = contextAsignacion;
    }

    public void buscarRepartidor(PedidoBase pedido) {
        Repartidor repartidor = contextAsignacion.asignar(pedido);
        if (repartidor == null) {
            System.out.println("Despacho: no hay repartidores disponibles");
            return;
        }
        pedido.setRepartidor(repartidor);
        System.out.println("Despacho: asignado " + repartidor.getNombre());
    }

    public void despachar(PedidoBase pedido) {
        pedido.despachar();
        System.out.println("Despacho: pedido " + pedido.getId() + " en camino");
    }

    public void entregar(PedidoBase pedido) {
        pedido.entregar();
        mediator.notificarEvento(this, "PEDIDO_ENTREGADO", pedido);
    }
}
