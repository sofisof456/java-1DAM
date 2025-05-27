package hospital;

public class Direccion {
    private String calle;
    private String localidad;

    Direccion(){}

    Direccion(String calle, String localidad){
        this.calle=calle;
        this.localidad=localidad;
    }

    public String getCalle() {
        return calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
