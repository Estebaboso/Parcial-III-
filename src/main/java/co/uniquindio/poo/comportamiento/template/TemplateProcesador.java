package co.uniquindio.poo.comportamiento.template;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public abstract class TemplateProcesador {
    public final void procesar(PedidoBase pedido) {
        // TODO: validar -> cobrar -> preparar -> entregar -> cerrar
    }

    protected void validar(PedidoBase pedido) {
        // TODO: paso común
    }

    protected void cobrar(PedidoBase pedido) {
        // TODO: paso común
    }

    protected abstract void preparar(PedidoBase pedido);

    protected abstract void entregar(PedidoBase pedido);

    protected void cerrar(PedidoBase pedido) {
        // TODO: hook opcional
    }
}
