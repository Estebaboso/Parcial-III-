package co.uniquindio.poo.comportamiento.mediator;

public abstract class MediatorBase {
    private MediatorPedido mediator;

    public MediatorPedido getMediator() {
        return mediator;
    }

    public void setMediator(MediatorPedido mediator) {
        this.mediator = mediator;
    }

}
