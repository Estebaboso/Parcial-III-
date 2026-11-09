package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

import java.util.List;

public interface StrategyAsignacion {
    Repartidor elegir(PedidoBase pedido, List<Repartidor> disponibles);
}
