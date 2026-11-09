package co.uniquindio.poo.comportamiento.chain;

import co.uniquindio.poo.estructural.composite.Combo;
import co.uniquindio.poo.estructural.composite.Producto;
import co.uniquindio.poo.estructural.composite.ProductoIndividual;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

public class HandlerProductos extends HandlerValidador {

    @Override
    protected boolean validar(PedidoBase pedido){

        //esta wea valida los productos del pedido
        return true;
    }

    //si se pregunta porque hay 2 validar hacen cosas distintas, el validar Producto comprueba cada producto individual

    private boolean validarProducto(Producto producto){
        if(producto == null || producto.getPrecio() <= 0) {
            return false;
        }if(producto instanceof ProductoIndividual){
            return true;
        }if(producto instanceof Combo){
            Combo combo = (Combo) producto;

            for(Producto p : combo.getProductos()){
                if(!validarProducto(p)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}