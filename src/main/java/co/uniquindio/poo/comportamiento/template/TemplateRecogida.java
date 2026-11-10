package co.uniquindio.poo.comportamiento.template;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class TemplateRecogida extends TemplateProcesador {
    @Override
    protected void preparar(PedidoBase pedido) {
        System.out.println("La tienda esta preparando el pedido " +pedido.getId());
        pedido.aceptar();
        pedido.marcarListo();
    }

    @Override
    protected void entregar(PedidoBase pedido) {
        System.out.println("El cliente recoge el pedido" +pedido.getId());
        pedido.entregar();
    }
}
