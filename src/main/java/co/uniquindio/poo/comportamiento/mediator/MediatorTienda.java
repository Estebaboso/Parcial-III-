package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class MediatorTienda extends MediatorBase {

    // metodo para iniciar la preparacion

    public void iniciarPreparacion(PedidoBase pedido) {
        System.out.println("Tienda " + pedido.getTienda().getNombre()
                + ": preparando el pedido " + pedido.getId());
        pedido.aceptar();
    }
    //metodo para marcar como listo y notificar el evento

    public void marcarListo(PedidoBase pedido) {
        System.out.println("Tienda: pedido " + pedido.getId() + " listo");
        pedido.marcarListo();
        mediator.notificarEvento(this, "PEDIDO_LISTO", pedido);
    }
}

