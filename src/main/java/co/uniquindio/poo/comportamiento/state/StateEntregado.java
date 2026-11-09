package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateEntregado implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");

    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido se ha aceptado");

    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");

    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");

    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");
        pedido.entregar();

    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");

    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido se ha entregado");

    }


}
