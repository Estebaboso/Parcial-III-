package co.uniquindio.poo.estructural.facade;

import co.uniquindio.poo.comportamiento.chain.HandlerValidador;
import co.uniquindio.poo.comportamiento.command.CommandHistorial;
import co.uniquindio.poo.comportamiento.mediator.MediatorControl;
import co.uniquindio.poo.comportamiento.memento.CaretakerPedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;
import co.uniquindio.poo.comportamiento.command.CommandCancelarPedido;
import co.uniquindio.poo.comportamiento.command.CommandCrearPedido;

public class PedidoFacade {

    private MediatorControl mediator;
    private CommandHistorial historial;
    private CaretakerPedido caretaker;
    private HandlerValidador validador;

    public PedidoFacade(MediatorControl mediator, CommandHistorial historial, CaretakerPedido caretaker, HandlerValidador validador) {

        this.mediator = mediator;
        this.historial = historial;
        this.caretaker = caretaker;
        this.validador = validador;
    }

    public void crearPedido(PedidoBase pedido, String usuario) {

        if (validador == null) {
            System.out.println("No existe una cadena de validación.");
            return;
        }

        boolean valido = validador.handle(pedido);

        if (!valido) {
            System.out.println("El pedido no pasó las validaciones.");
            return;
        }

        System.out.println("El pedido pasó todas las validaciones.");

        // "foto" inicial del pedido
        caretaker.guardar(pedido.createMemento());

        // La tienda crea el pedido y queda en el historial
        historial.ejecutar(new CommandCrearPedido(pedido, usuario), usuario);
    }

    public void pagarPedido(PedidoBase pedido) {
        //El pago avisa a la torre , tienda prepara, despacho asigna)
        mediator.getMediatorPagos().confirmarPago(pedido);
    }

    public void cancelarPedido(PedidoBase pedido, String usuario, String motivo) {
        // Command guarda su propio memento antes de cancelar
        historial.ejecutar(new CommandCancelarPedido(pedido, usuario, motivo), usuario);
    }

    public void deshacerUltimo() {
        historial.deshacerUltimo();
    }

    public MediatorControl getMediator() {
        return mediator;
    }

    public void setMediator(MediatorControl mediator) {
        this.mediator = mediator;
    }

    public CommandHistorial getHistorial() {
        return historial;
    }

    public void setHistorial(CommandHistorial historial) {
        this.historial = historial;
    }

    public CaretakerPedido getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(CaretakerPedido caretaker) {
        this.caretaker = caretaker;
    }

    public HandlerValidador getValidador() {
        return validador;
    }

    public void setValidador(HandlerValidador validador) {
        this.validador = validador;
    }


}

