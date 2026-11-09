package co.uniquindio.poo.model;

public class Repartidor extends Persona {
    private String vehiculo;
    private double calificacion;
    private int pedidosActivos;
    private double distanciaATienda;
    private boolean disponible;

    public Repartidor(String id, String nombre, int edad, String telefono, String vehiculo, double calificacion, double distanciaATienda) {
        super(id, nombre, edad, telefono);
        this.vehiculo = vehiculo;
        this.calificacion = calificacion;
        this.distanciaATienda = distanciaATienda;
        this.pedidosActivos = 0;
        this.disponible = true;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getPedidosActivos() {
        return pedidosActivos;
    }

    public void setPedidosActivos(int pedidosActivos) {
        this.pedidosActivos = pedidosActivos;
    }

    public double getDistanciaATienda() {
        return distanciaATienda;
    }

    public void setDistanciaATienda(double distanciaATienda) {
        this.distanciaATienda = distanciaATienda;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
