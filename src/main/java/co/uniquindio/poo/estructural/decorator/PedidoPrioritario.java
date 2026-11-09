package co.uniquindio.poo.estructural.decorator;

public class PedidoPrioritario extends PedidoDecorator {
    private double recargo;

    public PedidoPrioritario(Pedido pedido, double recargo) {
        super(pedido);
        this.recargo = recargo;
    }

    public double getRecargo() { return recargo; }
    public void setRecargo(double recargo) { this.recargo = recargo; }

    @Override
    public double getCosto() {

        return 0;
    }

    @Override
    public String getDescripcion() {

        return "";
    }
}
