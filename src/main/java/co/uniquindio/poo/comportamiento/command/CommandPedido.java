package co.uniquindio.poo.comportamiento.command;

public interface CommandPedido {
    void ejecutar();

    void deshacer();

    String getDescripcion();
}
