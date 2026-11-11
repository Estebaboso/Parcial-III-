package co.uniquindio.poo.comportamiento.command;

import co.uniquindio.poo.comportamiento.observer.EventPedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;


public class CommandCrearPedido implements CommandPedido {
    private PedidoBase pedido;
    private String usuario;

    public CommandCrearPedido(PedidoBase pedido, String usuario) {
        this.pedido = pedido;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        System.out.println("Command " + usuario + " creó el pedido " + pedido.getId());
        // Esto avisa a los observers que el pedido se creo
        pedido.notificarObservadores(new EventPedido(pedido.getId(), "INICIO", pedido.getState().getNombre()));
    }

    @Override
    public void deshacer() {
        // Va a state y aplica el  cancelar
        pedido.cancelar();
    }

    @Override
    public String getDescripcion() {
        return "Crear pedido " + pedido.getId();
    }


    public PedidoBase getPedido() {
        return pedido;
    }

    public void setPedido(PedidoBase pedido) {
        this.pedido = pedido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


}
