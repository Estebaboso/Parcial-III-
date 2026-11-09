package co.uniquindio.poo.estructural.composite;

public class ProductoIndividual implements Producto {
    private String id;
    private String nombre;
    private double precio;

    public ProductoIndividual(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
