package co.uniquindio.poo.estructural.decorator;

public class PedidoEmpaque extends PedidoDecorator {
    private double costoEmpaque;

    public PedidoEmpaque(Pedido pedido, double costoEmpaque) {
        super(pedido);
        this.costoEmpaque = costoEmpaque;
    }

    public double getCostoEmpaque() { return costoEmpaque; }
    public void setCostoEmpaque(double costoEmpaque) { this.costoEmpaque = costoEmpaque; }

    @Override
    public double getCosto() {

        return 0;
    }

    @Override
    public String getDescripcion() {

        return "";
    }
}
