package co.uniquindio.poo.estructural.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto {
    private String nombre;
    private double descuento;
    private List<Producto> productos;

    public Combo(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }
    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }

    @Override
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public double getPrecio() {
        // TODO: sumar el precio de los productos y aplicar el descuento
        return 0;
    }
}
