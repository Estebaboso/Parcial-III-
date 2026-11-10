package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;
import java.util.List;

public class StrategyMenorCarga implements StrategyAsignacion {

    @Override
    public Repartidor elegir(PedidoBase pedido, List<Repartidor> disponibles) {

        Repartidor seleccionado = null;

        for (Repartidor repartidor : disponibles) {
            if (repartidor.isDisponible()) {
                //otro q se parece mucho pero este en cambio toma al q menos pedidos activos tenga
                if (seleccionado == null || repartidor.getPedidosActivos() < seleccionado.getPedidosActivos()) {

                    seleccionado = repartidor;
                }
            }
        }

        return seleccionado;
    }
}