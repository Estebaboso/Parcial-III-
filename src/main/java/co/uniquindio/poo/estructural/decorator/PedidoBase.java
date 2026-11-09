package co.uniquindio.poo.estructural.decorator;

import co.uniquindio.poo.comportamiento.memento.MementoPedido;
import co.uniquindio.poo.comportamiento.observer.EventPedido;
import co.uniquindio.poo.comportamiento.observer.ObserverPedido;
import co.uniquindio.poo.comportamiento.observer.SubjectPedido;
import co.uniquindio.poo.comportamiento.state.StatePedido;
import co.uniquindio.poo.estructural.composite.Producto;
import co.uniquindio.poo.model.Cliente;
import co.uniquindio.poo.model.Repartidor;
import co.uniquindio.poo.model.Tienda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoBase implements Pedido, SubjectPedido {
    private String id;
    private Tienda tienda;
    private Cliente cliente;
    private List<Producto> productos;
    private Repartidor repartidor;
    private double costoEnvio;
    private double distanciaKm;
    private LocalDateTime fechaCreacion;
    private StatePedido state;
    private List<ObserverPedido> observers;

    public PedidoBase(String id, Tienda tienda, Cliente cliente, double distanciaKm) {
        this.id = id;
        this.tienda = tienda;
        this.cliente = cliente;
        this.distanciaKm = distanciaKm;
        this.productos = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.fechaCreacion = LocalDateTime.now();

    }

    // ---------- Decorator (Pedido) ----------
    @Override
    public double getCosto() {

        return 0;
    }

    @Override
    public String getDescripcion() {

        return "";
    }

    // ---------- Observer (SubjectPedido) ----------
    @Override
    public void subscribir(ObserverPedido observer) {

    }

    @Override
    public void desuscribrir(ObserverPedido observer) {

    }

    @Override
    public void notificarObservadores(EventPedido event) {

    }

    // ---------- State ----------

    //Cambiar para que notifique a los observers

    // ---------- Memento ----------
    public MementoPedido createMemento() {
        /
        return null;
    }

    public void restoreMemento(MementoPedido memento) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public StatePedido getState() {
        return state;
    }

    public void setState(StatePedido state) {
        this.state = state;
    }

    public List<ObserverPedido> getObservers() {
        return observers;
    }


}
