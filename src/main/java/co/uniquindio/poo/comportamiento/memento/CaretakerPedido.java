package co.uniquindio.poo.comportamiento.memento;

import java.util.ArrayList;
import java.util.List;

public class
CaretakerPedido {
    private List<MementoPedido> mementos;

    public CaretakerPedido() {
        this.mementos = new ArrayList<>();
    }

    public List<MementoPedido> getMementos() { return mementos; }
    public void setMementos(List<MementoPedido> mementos) { this.mementos = mementos; }

    public void guardar(MementoPedido memento) {
        // TODO
    }

    public MementoPedido recuperarUltimo() {
        // TODO
        return null;
    }
}
