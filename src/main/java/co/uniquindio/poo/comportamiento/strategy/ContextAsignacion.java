package co.uniquindio.poo.comportamiento.strategy;

import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.model.Repartidor;

import java.util.List;

public class ContextAsignacion {

    // este atibuto lo q hace es almacenar la estrategia que se utilizara para q tome el repartirdor
    private StrategyAsignacion strategy;
    //mientras que este almacena los repartidores disponibles
    private List<Repartidor> repartidores;

    public ContextAsignacion(StrategyAsignacion strategy, List<Repartidor> repartidores){
        this.strategy = strategy;
        this.repartidores = repartidores;
    }

    //este metodo es el que recibe el pedido
    public Repartidor asignar(PedidoBase pedido) {
        // revisa si hay una estrategia si no no se puede elegir un repartidor xd
        if(strategy == null) {
            // y pues si no hay salta esta excepcion pues lo q hace es detener el metodo para que no asigne una random sin saber como
            throw new IllegalStateException("No se ha definido una estrategia de asignacion");
        }
        //si si existe pues se le asigna un repartidor dependiendo la estrategia asignada
        return  strategy.elegir(pedido, repartidores);
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