package co.uniquindio.poo.comportamiento.chain;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public abstract class HandlerValidador {

    private HandlerValidador next;

    public HandlerValidador getNext() {
        return next;
    }

    public void setNext(HandlerValidador next) {
        this.next = next;
    }

    //esta vaina lo que hace es validar el pedido y si ta bien lo pasa al siguiente y asi, si alguna falla se supone que se detiene.
    public boolean handle(PedidoBase pedido){
        if(!validar(pedido)){
            return false;
        }if(next != null) {
            return next.handle(pedido);
        }
        return true;
    }

    protected abstract boolean validar(PedidoBase pedido);
}
