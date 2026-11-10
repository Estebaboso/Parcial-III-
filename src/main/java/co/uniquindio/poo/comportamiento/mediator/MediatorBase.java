package co.uniquindio.poo.comportamiento.mediator;

public abstract class MediatorBase {
    protected MediatorPedido mediator;

    public MediatorPedido getMediator() {
        return mediator;
    }

    public void setMediator(MediatorPedido mediator) {
        this.mediator = mediator;
    }

}
