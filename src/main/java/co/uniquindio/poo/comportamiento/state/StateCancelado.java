package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateCancelado implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido no se puede pagar porque ha sido cancelado");


    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido no se puede aceptar porque ha sido cancelado");

    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido no puede marcarse como listo porque ha sido cancelado");

    }

    @Override
    public void despachar(PedidoBase pedido) {
     System.out.println("El pedido no puede despacharse porque ha sido cancelado");
    }

    @Override
    public void entregar(PedidoBase pedido) {
    System.out.println("El pedido no puede entregarse porque ha sido cancelado");
    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido ha sido cancelado");
    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido no se puede reembolsar porque ha sido cancelado");

    }

}
