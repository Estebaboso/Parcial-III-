package co.uniquindio.poo.comportamiento.template;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

public abstract class TemplateProcesador {
    public final void procesar(PedidoBase pedido) {
        validar(pedido);
        cobrar(pedido);
        preparar(pedido);
        entregar(pedido);
        cerrar(pedido);
    }
    //etto comprueba q exista el pedido y tengan productos
    protected void validar(PedidoBase pedido) {
        if(pedido == null){
            throw new IllegalArgumentException("El pedido no puede ser nulo.");
        }

        if(pedido.getProductos().isEmpty()){
            throw new IllegalArgumentException("EL pedido no tiene productos.");
        }
    }

    //se utiliza el metodo que ya tiene pedido
    protected void cobrar(PedidoBase pedido) {
        pedido.pagar();
    }

    protected abstract void preparar(PedidoBase pedido);

    protected abstract void entregar(PedidoBase pedido);

    //esto simplemente muestra que el proceso termino xd
    protected void cerrar(PedidoBase pedido) {
        System.out.println("Proceso del pedido" +pedido.getId() +" finalizado.");
    }
}
