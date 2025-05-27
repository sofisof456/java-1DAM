package Acuario;

public class Medusa extends AnimalMaritimo{
    private boolean  transparencia; //true=esTransparente, false=noTransparante
    private String longitud_tentaculos;

    Medusa(){};

    Medusa( boolean  transparencia, String longitud_tentaculos){
        this.transparencia = transparencia;
        this.longitud_tentaculos = longitud_tentaculos;
    }

    Medusa(String nombre, int edad, double tamaño, String habitat, String alimentacion, boolean  transparencia, String longitud_tentaculos ) {
        super(nombre, edad, tamaño, habitat, alimentacion);
        this.transparencia = transparencia;
        this.longitud_tentaculos = longitud_tentaculos;
    }

    public boolean getTransparencia() {return transparencia;}
    public void setTransparencia(boolean transparencia) {this.transparencia=transparencia;}

    public String getLongitud_tentaculos() {return longitud_tentaculos;}
    public void setLongitud_tentaculos(String longitud_tentaculos) {this.longitud_tentaculos=longitud_tentaculos;}

    @Override
    public String toString() {
        StringBuilder sb_medusa = new StringBuilder();

        sb_medusa.append("Transparencia........: ").append(getTransparencia()).append("\n");
        sb_medusa.append("Longitud_tentaculos..: ").append(getLongitud_tentaculos()).append("\n");

        return super.toString()+ sb_medusa.toString();
    }
}
