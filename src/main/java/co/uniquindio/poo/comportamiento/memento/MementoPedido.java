package co.uniquindio.poo.comportamiento.memento;

import co.uniquindio.poo.comportamiento.state.StatePedido;
import co.uniquindio.poo.model.Repartidor;

public class MementoPedido {
    private StatePedido state;
    private Repartidor repartidor;
    private double costoEnvio;

    public MementoPedido(StatePedido state, Repartidor repartidor, double costoEnvio) {
        this.state = state;
        this.repartidor = repartidor;
        this.costoEnvio = costoEnvio;
    }


    public StatePedido getState() { return state; }
    public Repartidor getRepartidor() { return repartidor; }
    public double getCostoEnvio() { return costoEnvio; }

}
