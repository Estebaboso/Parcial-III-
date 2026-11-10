package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.comportamiento.strategy.ContextAsignacion;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class MediatorControl implements MediatorPedido {
    private MediatorPagos mediatorPagos;
    private MediatorTienda mediatorTienda;
    private MediatorDespacho mediatorDespacho;
    private ContextAsignacion contextAsignacion;

    public MediatorControl(MediatorPagos mediatorPagos, MediatorTienda mediatorTienda, MediatorDespacho mediatorDespacho, ContextAsignacion contextAsignacion) {
        this.mediatorPagos = mediatorPagos;
        this.mediatorTienda = mediatorTienda;
        this.mediatorDespacho = mediatorDespacho;
        this.contextAsignacion = contextAsignacion;

    }

    @Override
    public void notificarEvento(Object sender, String event, PedidoBase pedido) {
        switch (event) {
            case "PAGO_CONFIRMADO":
                mediatorTienda.iniciarPreparacion(pedido);
                mediatorDespacho.buscarRepartidor(pedido);
                break;
            case "PEDIDO_LISTO":
                mediatorDespacho.despachar(pedido);
                break;
            case "PEDIDO_ENTREGADO":
                System.out.println("Torre: liquidando a la tienda y al repartidor");
                break;
            default:
                System.out.println("Torre: evento desconocido " + event);
        }
    }

    public MediatorPagos getMediatorPagos() {
        return mediatorPagos;
    }

    public void setMediatorePagos(MediatorPagos mediatorPagos) {
        this.mediatorPagos = mediatorPagos;
    }

    public MediatorTienda getMediatorTienda() {
        return mediatorTienda;
    }

    public void setMediatorTienda(MediatorTienda mediatorTienda) {
        this.mediatorTienda = mediatorTienda;
    }

    public MediatorDespacho getMediatorDespacho() {
        return mediatorDespacho;
    }

    public void setMediatorDespacho(MediatorDespacho mediatorDespacho) {
        this.mediatorDespacho = mediatorDespacho;
    }

    public ContextAsignacion getAsignacion() {
        return contextAsignacion;
    }

    public void setAsignacion(ContextAsignacion contextAsignacion) {
        this.contextAsignacion = contextAsignacion;
    }
}
