package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;
import java.util.List;

public class StrategyMejorCalificado implements StrategyAsignacion {

    @Override
    public Repartidor elegir(PedidoBase pedido, List<Repartidor> disponibles) {

        Repartidor seleccionado = null;

        for (Repartidor repartidor : disponibles) {
            if (repartidor.isDisponible()) {
                //es muy parecido al mas cercano la diferencia es que en vez de tomar en cuenta la distancia esta vez tomara la calificacion que tiene el repartidor
                if (seleccionado == null || repartidor.getCalificacion() > seleccionado.getCalificacion()) {
                    seleccionado = repartidor;
                }
            }
        }

        return seleccionado;
    }
}