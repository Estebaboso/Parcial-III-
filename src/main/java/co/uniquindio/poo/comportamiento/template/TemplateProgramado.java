package co.uniquindio.poo.comportamiento.template;

import co.uniquindio.poo.estructural.decorator.PedidoBase;

import java.time.LocalDateTime;

public class TemplateProgramado extends TemplateProcesador {
    private LocalDateTime horaProgramada;

    public TemplateProgramado(LocalDateTime horaProgramada) {
        this.horaProgramada = horaProgramada;
    }

    public LocalDateTime getHoraProgramada() { return horaProgramada; }
    public void setHoraProgramada(LocalDateTime horaProgramada) { this.horaProgramada = horaProgramada; }

    @Override
    protected void preparar(PedidoBase pedido) {
        // TODO
    }

    @Override
    protected void entregar(PedidoBase pedido) {
        // TODO
    }
}
