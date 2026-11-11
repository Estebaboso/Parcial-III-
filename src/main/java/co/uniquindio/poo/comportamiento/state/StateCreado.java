package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateCreado implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido se ha pagado correctamente");
        pedido.setState(new StatePagado());

    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido se ha pagado correctamente, su preparación sera confirmada ");

    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido no se puede pagar como listo si apenas ha sido creado");

    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido no se puede despachar si apenas ha sido creado");

    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido no se puede entregar si apenas ha sido creado");

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
        return  "CREADO";
    }


}
