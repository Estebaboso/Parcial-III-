package co.uniquindio.poo.comportamiento.state;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public interface StatePedido {
    void pagar(PedidoBase pedido);

    void aceptar(PedidoBase pedido);

    void marcarListo(PedidoBase pedido);

    void despachar(PedidoBase pedido);

    void entregar(PedidoBase pedido);

    void cancelar(PedidoBase pedido);

    void reembolsar(PedidoBase pedido);


}
