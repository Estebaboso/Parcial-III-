package co.uniquindio.poo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverAuditoria implements ObserverPedido {
    private List<String> registros;

    public ObserverAuditoria() {
        this.registros = new ArrayList<>();
    }

    @Override
    public void actualizar(EventPedido evento) {

    }

    public List<String> getRegistros() {
        return registros;
    }

    public void setRegistros(List<String> registros) {
        this.registros = registros;
    }


}
