package co.uniquindio.poo.estructural.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto {
    private String nombre;
    private double descuento;
    private List<Producto> listaDeProductos;

    public Combo(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.listaDeProductos = new ArrayList<>();
    }

    //Metodo para agregar productos al combo
    public void agregarProducto(Producto producto) {
        listaDeProductos.add(producto);
    }

    //Metodo para quitar productos del combo
    public void quitarProducto(Producto producto) {
        listaDeProductos.remove(producto);
    }

    @Override
    public void mostrar() {

        System.out.println("Combo: " + nombre + "\nPrecio: " + obtenerPrecio());

        for (Producto p : listaDeProductos) {
            p.mostrar();
        }
    }

    @Override
    public double obtenerPrecio() {
        double valorTotal = 0;
        for (Producto p : listaDeProductos) {
            valorTotal += p.obtenerPrecio();
        }
        return valorTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Producto> getProductos() {
        return listaDeProductos;
    }

    public void setProductos(List<Producto> productos) {
        this.listaDeProductos = productos;
    }




}
