package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class StateEnCamino implements StatePedido {
    // Transición sugerida: entregar() -> StateEntregado (aquí NO se permite reembolsar)

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
