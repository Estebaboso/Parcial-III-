package co.uniquindio.poo.comportamiento.observer;

public interface SubjectPedido {
    void subscribir(ObserverPedido observer);
    void desuscribrir(ObserverPedido observer);
    void notificarObservadores(EventPedido event);
}
