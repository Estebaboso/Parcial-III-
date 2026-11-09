package co.uniquindio.poo.comportamiento.chain;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class HandlerCobertura extends HandlerValidador {

    private static final double COBERTURAMAXIMAKM = 10.0;

    @Override
    protected boolean validar(PedidoBase pedido){

        //esto basicamente revisa si la direccion esta por encima de los 10 km o si es 0 o un numero negativo si es asi se rechaza.

        if(pedido == null) {
            return false;
        }

        if(pedido.getDistanciaKm()<= 0 || pedido.getDistanciaKm() > COBERTURAMAXIMAKM){
            System.out.println("La direccion se encuentra fuera de la cobertura");
            return false;
        }
        return true;
    }
}
