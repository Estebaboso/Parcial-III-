package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public interface MediatorPedido {
    void notificarEvento(Object sender, String event, PedidoBase pedido);
}
