package co.uniquindio.poo.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

public class
CaretakerPedido {
    private List<MementoPedido> mementos;

    public CaretakerPedido() {
        this.mementos = new ArrayList<>();
    }

    public List<MementoPedido> getMementos() {
        return mementos;
    }

    public void setMementos(List<MementoPedido> mementos) {
        this.mementos = mementos;
    }
// Esto sirve para el tema de que si un repartidor llega a rechazar un pedido, este vuelva a su estado original o se guarde

    public void guardar(MementoPedido memento) {
        mementos.add(memento);
    }

    public MementoPedido recuperarUltimo() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.remove(mementos.size() - 1);
    }
}
