package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateEnCamino implements StatePedido {

 // ME MAME

    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido ya se ha pagado y esta en camino");

    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido ya ha sido pagado y se esta en camino");

    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido ya se ha marcado y esta en camino");

    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido ha sido despachado y se encuentra en camino");
        pedido.despachar();

    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en camino");

    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido ha sido cancelado");
        pedido.cancelar();

    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en camino ya no puede reembolsarse");

    }


}
