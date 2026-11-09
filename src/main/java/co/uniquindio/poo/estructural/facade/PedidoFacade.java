package co.uniquindio.poo.estructural.facade;

import co.uniquindio.poo.comportamiento.chain.HandlerValidador;
import co.uniquindio.poo.comportamiento.command.CommandHistorial;
import co.uniquindio.poo.comportamiento.mediator.MediatorControl;
import co.uniquindio.poo.comportamiento.memento.CaretakerPedido;
import co.uniquindio.poo.estructural.decorator.PedidoBase;

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

    public void crearPedido(PedidoBase pedido, String usuario) {

    }

    public void pagarPedido(PedidoBase pedido) {

    }

    public void cancelarPedido(PedidoBase pedido, String usuario, String motivo) {

    }

    public void deshacerUltimo() {

    }
}
