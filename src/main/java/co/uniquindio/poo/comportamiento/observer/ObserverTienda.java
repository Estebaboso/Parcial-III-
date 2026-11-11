package co.uniquindio.poo.comportamiento.observer;

import co.uniquindio.poo.model.Tienda;

public class ObserverTienda implements ObserverPedido {
    private Tienda tienda;

    public ObserverTienda(Tienda tienda) {

        this.tienda = tienda;
    }

    @Override
    public void actualizar(EventPedido evento) {
        System.out.println("Tienda " + tienda.getNombre() + " Pedido " + evento.getPedidoId()
                + " ahora está en " + evento.getEstadoNuevo());
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }


}
