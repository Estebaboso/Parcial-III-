package co.uniquindio.poo.estructural.decorator;

public class PedidoPrioritario extends PedidoDecorator {
    private double recargo;

    public PedidoPrioritario(Pedido pedidoBasico, double recargo) {
        super(pedidoBasico);
        this.recargo = recargo;
    }

    @Override
    public double getCosto() {

        return pedidoBasico.getCosto() + recargo;
    }

    @Override
    public String getDescripcion() {

        return pedidoBasico.getDescripcion();
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

}
