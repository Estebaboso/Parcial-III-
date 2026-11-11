package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

import java.util.List;

public class StrategyMasCercano implements StrategyAsignacion {

    @Override
    public Repartidor elegir(PedidoBase pedido, List<Repartidor> disponibles) {

        //se crea esta variable porque aun no hemos seleccionado un repartidor por eso inicia en null
        Repartidor seleccionado = null;

        for(Repartidor repartidor : disponibles){
            //aqui se verifica la disponibilidad del repartidor utilizando el atributo disponible de la clase repartidor
            if(repartidor.isDisponible()){
                //este if lo que hace es primero revisa uqe aun no se haya seleccionado un repartidor y luego revis la destancia del repartidor a la tienda y reemplaza el repartidor al mas cercano
                if(seleccionado == null || repartidor.getDistanciaATienda() < seleccionado.getDistanciaATienda()){
                    seleccionado = repartidor;
                }
            }
        }
        return seleccionado;
    }
}
