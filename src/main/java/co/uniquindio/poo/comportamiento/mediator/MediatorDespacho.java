package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.comportamiento.strategy.Asignacion;
import co.uniquindio.poo.model.Repartidor;

public class MediatorDespacho extends MediatorBase {

    private Asignacion asignacion;

    public MediatorDespacho(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public Asignacion getContextAsignacion() {
        return asignacion;
    }

    public void setContextAsignacion(Asignacion contextAsignacion) {
        this.asignacion = contextAsignacion;
    }

    public void buscarRepartidor(PedidoBase pedido) {
        Repartidor repartidor = asignacion.asignar(pedido);
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