package co.uniquindio.poo.comportamiento.command;

import java.time.LocalDateTime;

public class CommandRegistro {
    private CommandPedido command;
    private String usuario;
    private LocalDateTime fechaHora;

    public CommandRegistro(CommandPedido command, String usuario) {
        this.command = command;
        this.usuario = usuario;
        this.fechaHora = LocalDateTime.now();
    }

    public CommandPedido getCommand() {
        return command;
    }

    public void setCommand(CommandPedido command) {
        this.command = command;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

}
