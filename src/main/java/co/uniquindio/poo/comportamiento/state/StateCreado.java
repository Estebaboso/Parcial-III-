package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateCreado implements StatePedido {
    // Transición sugerida: pagar() -> StatePagado ; cancelar() -> StateCancelado

    @Override
    public void pagar(PedidoBase pedido) {

    }

    @Override
    public void aceptar(PedidoBase pedido) {

    }

    @Override
    public void marcarListo(PedidoBase pedido) {

    }

    @Override
    public void despachar(PedidoBase pedido) {

    }

    @Override
    public void entregar(PedidoBase pedido) {

    }

    @Override
    public void cancelar(PedidoBase pedido) {

    }

    @Override
    public void reembolsar(PedidoBase pedido) {

    }


}
