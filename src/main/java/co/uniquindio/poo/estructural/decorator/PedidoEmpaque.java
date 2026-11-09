package co.uniquindio.poo.estructural.decorator;

public class PedidoEmpaque extends PedidoDecorator {
    private double costoEmpaque;

    public PedidoEmpaque(Pedido pedidoBasico, double costoEmpaque) {
        super(pedidoBasico);
        this.costoEmpaque = costoEmpaque;
    }

    @Override
    public double getCosto() {
        return pedidoBasico.getCosto() + costoEmpaque;
    }

    @Override
    public String getDescripcion() {

        return pedidoBasico.getDescripcion() ;
    }

    public double getCostoEmpaque() { return costoEmpaque; }
    public void setCostoEmpaque(double costoEmpaque) { this.costoEmpaque = costoEmpaque; }


}
