package co.uniquindio.poo.estructural.decorator;

public class PedidoPropina extends PedidoDecorator {
    private double propina;

    public PedidoPropina(Pedido pedidoBasico, double propina) {
        super(pedidoBasico);
        this.propina = propina;
    }

    @Override
    public double getCosto() {

        return pedidoBasico.getCosto() + propina;
    }

    @Override
    public String getDescripcion() {

        return pedidoBasico.getDescripcion();
    }


    public double getPropina() { return propina; }

    public void setPropina(double propina) { this.propina = propina; }


}
