package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

import java.util.List;

public class StrategyMejorCalificado implements StrategyAsignacion {
    @Override
    public Repartidor elegir(PedidoBase pedido, List<Repartidor> disponibles) {

        return null;
    }
}
