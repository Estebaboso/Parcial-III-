package co.uniquindio.poo.model;

public class Cliente extends Persona {
    private String direccion;
    private boolean suscriptor;

    public Cliente(String id, String nombre, int edad, String telefono, String direccion, boolean suscriptor) {
        super(id, nombre, edad, telefono);
        this.direccion = direccion;
        this.suscriptor = suscriptor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getSuscriptor() {
        return suscriptor;
    }

    public void setSuscriptor(boolean suscriptor) {
        this.suscriptor = suscriptor;
    }

}
