package co.uniquindio.poo.estructural.decorator;

public class PedidoPropina extends PedidoDecorator {
    private double propina;

    public PedidoPropina(Pedido pedido, double propina) {
        super(pedido);
        this.propina = propina;
    }

    public double getPropina() { return propina; }
    public void setPropina(double propina) { this.propina = propina; }

    @Override
    public double getCosto() {

        return 0;
    }

    @Override
    public String getDescripcion() {

        return "";
    }
}
