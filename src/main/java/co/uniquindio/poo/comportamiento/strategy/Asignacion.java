package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

import java.util.List;

public class Asignacion {
    private StrategyAsignacion strategy;
    private List<Repartidor> repartidores;

    public Asignacion(StrategyAsignacion strategy, List<Repartidor> repartidores) {
        this.strategy = strategy;
        this.repartidores = repartidores;
    }

    public Repartidor asignar(PedidoBase pedido) {

        return null;
    }


    public StrategyAsignacion getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyAsignacion strategy) {
        this.strategy = strategy;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(List<Repartidor> repartidores) {
        this.repartidores = repartidores;
    }
}