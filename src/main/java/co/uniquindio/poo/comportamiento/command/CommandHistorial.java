package co.uniquindio.poo.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistorial {
    private List<CommandRegistro> registros;

    public CommandHistorial() {
        this.registros = new ArrayList<>();
    }

    public void ejecutar(CommandPedido command, String usuario) {
        command.ejecutar();   // si falla lanza error y no se guarda en el historial
        registros.add(new CommandRegistro(command, usuario));
    }

    public void deshacerUltimo() {
        if (registros.isEmpty()) {
            System.out.println("Historial No hay comandos para deshacer");
            return;
        }
        CommandRegistro ultimo = registros.remove(registros.size() - 1);
        ultimo.getCommand().deshacer();
        System.out.println("Historial Deshecho: " + ultimo.getCommand().getDescripcion()
                + " (lo había hecho " + ultimo.getUsuario() + ")");
    }

    public void mostrarHistorial() {
        for (CommandRegistro r : registros) {
            System.out.println(r.getFechaHora() + " | " + r.getUsuario() + " | " + r.getCommand().getDescripcion());
        }
    }

    public List<CommandRegistro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<CommandRegistro> registros) {
        this.registros = registros;
    }


}
