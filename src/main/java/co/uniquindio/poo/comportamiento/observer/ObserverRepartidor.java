package co.uniquindio.poo.comportamiento.observer;

import co.uniquindio.poo.model.Repartidor;

public class ObserverRepartidor implements ObserverPedido {
    private Repartidor repartidor;

    public ObserverRepartidor(Repartidor repartidor) {

        this.repartidor = repartidor;
    }

    @Override
    public void actualizar(EventPedido evento) {

    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }


}
