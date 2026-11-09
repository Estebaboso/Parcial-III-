package co.uniquindio.poo.comportamiento.mediator;

import co.uniquindio.poo.comportamiento.strategy.Asignacion;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class MediatorControl implements MediatorPedido {
    private MediatorPagos mediatorPagos;
    private MediatorTienda mediatorTienda;
    private MediatorDespacho mediatorDespacho;
    private Asignacion asignacion;

    public MediatorControl(MediatorPagos mediatorPagos, MediatorTienda mediatorTienda, MediatorDespacho mediatorDespacho, Asignacion asignacion) {
        this.mediatorPagos = mediatorPagos;
        this.mediatorTienda = mediatorTienda;
        this.mediatorDespacho = mediatorDespacho;
        this.asignacion = asignacion;

    }
    @Override
    public void notificarEvento(Object sender, String event, PedidoBase pedido) {

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

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }


}
