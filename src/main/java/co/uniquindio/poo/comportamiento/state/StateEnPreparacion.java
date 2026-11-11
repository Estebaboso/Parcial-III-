package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateEnPreparacion implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en preparacion");

    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido ha sido aceptado y se encuentra en preparacion");
    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en preparacion");
        pedido.setState(new StateListoParaRecoger());
    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en preparacion");

    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra en preparacion");

    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido ha sido cancelado");
        pedido.setState(new StateCancelado());

    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido ha sido reembolsado");
        pedido.reembolsar();

    }

    @Override
    public String getNombre() {
        return  "EN PREPARACION";
    }


}
