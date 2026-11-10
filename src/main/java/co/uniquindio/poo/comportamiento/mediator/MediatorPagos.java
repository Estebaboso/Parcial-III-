package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class MediatorPagos extends MediatorBase {
    public void confirmarPago(PedidoBase pedido) {
        System.out.println("Pagos: cobrando el pedido " + pedido.getId());
        pedido.pagar();
        mediator.notificarEvento(this, "PAGO_CONFIRMADO", pedido);
    }
}

