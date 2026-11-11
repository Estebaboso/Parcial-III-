package co.uniquindio.poo.comportamiento.template;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class TemplateDomicilio extends TemplateProcesador {
    @Override
    protected void preparar(PedidoBase pedido) {
        System.out.println("La tienda este preparando el pedido" +pedido.getId());
        pedido.aceptar();
        pedido.marcarListo();
    }

    @Override
    protected void entregar(PedidoBase pedido) {
        System.out.println("El pedido esta en camino hacia el domicilio");
        pedido.despachar();
        pedido.entregar();
    }
}
