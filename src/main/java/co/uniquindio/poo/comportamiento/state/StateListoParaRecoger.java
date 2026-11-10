package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateListoParaRecoger implements StatePedido {


    @Override
    public void pagar(PedidoBase pedido) {
        System.out.println("El pedido ya ha sido pagado y se encuentra listo para recoger");

    }

    @Override
    public void aceptar(PedidoBase pedido) {
        System.out.println("El pedido ya ha sido aceptado y se encuentra listo para recoger");

    }

    @Override
    public void marcarListo(PedidoBase pedido) {
        System.out.println("El pedido esta listo para recoger");

    }

    @Override
    public void despachar(PedidoBase pedido) {
        System.out.println("El pedido esta listo para recoger");
    }

    @Override
    public void entregar(PedidoBase pedido) {
        System.out.println("El pedido esta listo para recoger");

    }

    @Override
    public void cancelar(PedidoBase pedido) {
        System.out.println("El pedido esta listo para recoger, ya no puede recogerse");

    }

    @Override
    public void reembolsar(PedidoBase pedido) {
        System.out.println("El pedido ha siddo reembolsado");
        pedido.reembolsar();

    }


}
