package co.uniquindio.poo.comportamiento.chain;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public abstract class HandlerValidador {

    private HandlerValidador next;

    public HandlerValidador getNext() { return next; }
    public void setNext(HandlerValidador next) { this.next = next; }

    public abstract boolean handle(PedidoBase pedido);
}
