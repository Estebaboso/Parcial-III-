package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StatePagado implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido ya ha sido pagado correctamente");

    }

    @Override
    public void aceptar(PedidoBase pedido) {
         System.out.println("El pedido se ha aceptado");
         pedido.setState(new StateEnPreparacion());
    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido se encuentra pagado su proceso se iniciara pronto");

    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra pagado su proceso se iniciara pronto");

    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido se encuentra pagado su proceso se iniciara pronto");

    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido se ha cancelado");
        pedido.cancelar();

    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido ha sido reembolsado");
        pedido.reembolsar();

    }

    @Override
    public String getNombre() {
        return  "PAGADO";
    }


}
