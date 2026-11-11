package co.uniquindio.poo.comportamiento.chain;

import co.uniquindio.poo.estructural.composite.Producto;
import co.uniquindio.poo.estructural.decorator.Pedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

import java.awt.desktop.SystemSleepEvent;

public class HandlerMonto extends HandlerValidador {

    private static final double MONTOMINIMO = 1000;

    @Override

    // en palabras simples, esto hace una suma de los valores del pedido y si no supera el monto minimo de 1000 devuelve false, si no da true

    protected boolean validar(PedidoBase pedido){
        if(pedido == null){
            return false;
        }

        double montoTotal = 0;

        for(Producto producto : pedido.getProductos()){
            montoTotal += producto.obtenerPrecio();
        }

        if(montoTotal < MONTOMINIMO){
            System.out.println("EL pedido no alcanza el monto minimo.");
            return false;
        }
        return true;
    }
}