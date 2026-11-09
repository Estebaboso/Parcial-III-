package co.uniquindio.poo.comportamiento.observer;

import co.uniquindio.poo.model.Cliente;

public class ObserverCliente implements ObserverPedido {
    private Cliente cliente;

    public ObserverCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void actualizar(EventPedido evento) {

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
