package co.uniquindio.poo.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistorial {
    private List<CommandRegistro> registros;

    public CommandHistorial() {
        this.registros = new ArrayList<>();
    }

    public List<CommandRegistro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<CommandRegistro> registros) {
        this.registros = registros;
    }

    public void ejecutarHistorial(CommandPedido command, String usuario) {

    }

    public void deshacerUltimo() {

    }
}
